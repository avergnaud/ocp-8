package ch8;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/*
it reads a text file, outputs each line on screen
and writes a copy of the file to disk.
uses buffers
*/
public class Example {

static List<String> readFile(File source) {

List<String> liste = new ArrayList<>();
String line;
try(BufferedReader br = new BufferedReader(
	new FileReader(source));) {
while((line = br.readLine()) != null) {
liste.add(line);
}
} catch(IOException e) {
out.println(e);
}
return liste;
}



public static void main(String... args) {

File source = new File("Zoo.csv");
File destination = new File("ZooCopy.csv");
List<String> data = readFile(source);
for(String record : data) {
	out.println(record);
}
writeFile(data, destination);

}


static void writeFile(List<String> liste, File destination) {

try(BufferedWriter bw = new BufferedWriter(
	new FileWriter(destination));) {
for(String s : liste) {
	bw.write(s);
	bw.newLine();
}
} catch(IOException e) {
out.println(e);
}

}

}

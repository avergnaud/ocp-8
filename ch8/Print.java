package ch8;

import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

public class Print {
public static void main(String... args) {

File file = new File("ch8Print.txt");

PrintWriter writer = null;
try {
writer = new PrintWriter(file);
writer.println("hello");
writer.println(42);
} catch (FileNotFoundException e) {
out.printf("FileNotFoundException %s%n",e);
} finally {
writer.close();
}

try {
Scanner scanner = new Scanner(file);
String s = scanner.nextLine();
int i = scanner.nextInt();
out.printf("read in file: %s %d %n",s,i);
} catch(FileNotFoundException e) {
out.printf("%s%n",e);
}

}}

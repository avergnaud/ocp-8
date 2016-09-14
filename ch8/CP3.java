package ch8;

import static java.lang.System.out;
import java.io.*;

/*
une_date.txt
25/12/2016
*/
public class CP3 {
public static void main(String... args) {

File f1 = new File("une_date.txt");
File f2 = new File("nouveau3.txt");
try(InputStream is = new FileInputStream(f1);
	OutputStream os = new FileOutputStream(f2)) {
byte[] b = new byte[20];
int h = is.read(b);
os.write(b,0,h);
} catch(IOException e) {
out.println(e);
}

}}

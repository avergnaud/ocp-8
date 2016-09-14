package ch8;

import static java.lang.System.out;
import java.io.*;

/*
une_date.txt
25/12/2016
*/
public class CP4 {
public static void main(String... args) {

File f1 = new File("une_date.txt");
File f2 = new File("nouveau4.txt");
try(InputStream is = new BufferedInputStream(new FileInputStream(f1));
	OutputStream os = new BufferedOutputStream(new FileOutputStream(f2))) {

byte[] b = new byte[1024];
int i;
while((i = is.read(b)) > 0) {
os.write(b,0,i);
os.flush();
}

} catch(IOException e) {
out.println(e);
}

}}

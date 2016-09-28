package quizz;

import static java.lang.System.out;
import java.io.*;

/*
une_date.txt
25/12/2016
*/
public class _0442 {
public static void main(String... args) {

File f1 = new File("une_date.txt");
File f2 = new File("nouveau.txt");
try(InputStream is = new FileInputStream(f1);
	OutputStream os = new FileOutputStream(f2)) {
while((int i = is.read()) != -1) {
os.write(i);
}
} catch(IOException e) {
out.println(e);
}

}}

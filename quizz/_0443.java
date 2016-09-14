package quizz;

import static java.lang.System.out;
import java.io.*;

/*
une_date.txt
25/12/2016

Est-ce que "nouveau2.txt" contiendra :
25/12/2016
\00\00\00\00\00\00\00\00\00
*/
public class _0443 {
public static void main(String... args) {

File f1 = new File("une_date.txt");
File f2 = new File("nouveau2.txt");
try(InputStream is = new FileInputStream(f1);
	OutputStream os = new FileOutputStream(f2)) {
byte[] b = new byte[20];
int h = is.read(b);
out.println(h + " bytes read");
os.write(b);
} catch(IOException e) {
out.println(e);
}

}}

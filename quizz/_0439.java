package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/*
assume ch8Print.txt exists in user's current directory
first line is: "hello"
*/
public class _0439 {
public static void main(String... args) {

char[] chars = new char[100];

File f = new File("ch8Print.txt");
try(InputStream is = new BufferedInputStream(
	new FileInputStream(f))) {

if(!is.isMarkSupported())
	return;

is.mark(100);
chars[0] = (char) is.read();
chars[1] = (char) is.read();
is.reset();
chars[2] = (char) is.read();
chars[3] = (char) is.read();
chars[4] = (char) is.read();
chars[5] = (char) is.read();

out.println(new String(chars));

} catch(IOException e) {
out.println(e);
}

}}

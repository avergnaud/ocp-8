package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/*
assume ch8Print.txt exists in user's current directory
	hello
	42
*/
public class _0441 {
public static void main(String... args) {

File file = new File("ch8Print.txt");
byte[] dest = new byte[20];

try(InputStream is = new FileInputStream(file)) {
is.read(dest);
} catch(IOException e) {
out.println(e);
}

out.println(new String(dest));

}}

package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/*
assume ch8Print.txt exists in user's current directory
first line is: "hello"
*/
public class _0438 {
public static void main(String... args) {

File f = new File("ch8Print.txt");
try(InputStream is = new FileInputStream(f)) {

int i = is.read();

} catch(FileNotFoundException e) {
out.println(e);
}

}}

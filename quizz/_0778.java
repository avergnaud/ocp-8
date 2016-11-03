package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class _0778 {

public static void main(String... args) {

Random r = new Random();
int i = r.nextInt(10_000);
String fileName = "rand" + i;

File file = new File(fileName);
try(Writer w = new FileWriter(file)) {
w.append('a').append(new StringBuilder("  hello  "),1,8);
w.write(90);
char[] chars = {'x','y','z','','a','n','d','','',''};
w.write(chars,3,5);
w.write("this_is_the_end");
} catch(IOException e) {out.println(e);}

}}

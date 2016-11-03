package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class _0753 {

public static void main(String... args) {

Random random = new Random();
String fileName = "random" + random.nextInt(10000);

File file = new File(fileName);
StringBuilder sb = new StringBuilder(" hello world ");
char[] cs = {'a','b','c'};

try(BufferedWriter bw = new BufferedWriter(
  new FileWriter(file)
);) {
  bw.append('a')
    .append(sb)
    .append(" toto",0,2);
  bw.write(cs);
  bw.flush();
} catch(IOException e) {out.println(e);}

}}

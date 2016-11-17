package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class _0698 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0698.java");
BasicFileAttributes bfa = null;
try {
  bfa = Files.readAttributes(thisPath,BasicFileAttributes.class);
} catch(IOException e) {out.println(e);}
out.println("BasicFileAttributes size: " + bfa.size());

try {
  long l = Files.size(thisPath);
  out.println("Files.size: " + l);
} catch(IOException e) {out.println(e);}

File file = new File("quizz/_0698.java");
out.println("File length: " + file.length());

}}

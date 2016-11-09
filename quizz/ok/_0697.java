package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class _0697 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0697.java");
BasicFileAttributes bfa = null;
try {
  bfa = Files.readAttributes(thisPath,BasicFileAttributes.class);
  out.println(bfa.size());
} catch(IOException e) {out.println(e);}
out.println("BasicFileAttributes size: " + bfa.size());

try {
  long l = Files.getSize(thisPath);
  out.println("Files.getSize: " + l);
} catch(IOException e) {out.println(e);}

File file = new File("quizz/_0697.java");
out.println("File length: " + file.length());

}}

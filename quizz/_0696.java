package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class _0696 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0696.java");
try {
  BasicFileAttributes bfa = Files.readAttributes(thisPath,BasicFileAttributes.class);
  out.println(bfa);
} catch(IOException e) {out.println(e);}

}}

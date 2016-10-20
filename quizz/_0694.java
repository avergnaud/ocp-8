package quizz;

import static java.lang.System.out;
import java.nio.file.*;

public class _0694 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0694.java");
BasicFileAttributes bfa = Files.readAttributes(thisPath,BasicFileAttributes.class);
out.println(bfa);

}}

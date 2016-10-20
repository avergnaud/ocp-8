package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class _0695 {

public static void main(String... args) {

Path thisPath = Paths.get("quizz/_0694.java");
BasicFileAttributes bfa = Files.readAttributes(thisPath,BasicFileAttributes.class);
out.println(bfa);

}}

package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0523 {
public static void main(String... args) {

Path hello = Paths.get(".").resolve(Paths.get("quizz/_0520.java"));

try {
out.println(Files.isDirectory(hello));
} catch(IOException e) {out.println(e);}

}}

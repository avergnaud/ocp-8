package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0524 {
public static void main(String... args) {

String s = "quizz/_0524.java";
File file = new File(s);
out.println(file.toAbsolutePath());

Path a = Paths.get(s).getAbsolutePath();
out.println(a);

}}

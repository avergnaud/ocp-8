package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0526 {
public static void main(String... args) throws IOException {

String s = "/home/ubuntu/dev/git/avergnaud/ocp-8/quizz/_0526.java";
File f = new File(s);
out.println(f.length());

Path p = Paths.get(s);
out.println(Files.length(p));

}}

package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _0525 {
public static void main(String... args) {

String s = "/home/ubuntu/dev/git/avergnaud/ocp-8/quizz/_0525.java";
File f = new File(s);
out.println(f.isHidden());

Path p = Paths.get(s);
out.println(Files.isHidden(p));

}}

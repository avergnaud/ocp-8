package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0686 {

public static void main(String... args) {

Path p1 = Paths.get("/home/ubuntu/dev/");
Path p2 = Paths.get("/home/ubuntu/dev/git/../");

out.println(p1.getParent());
out.println(p2.getParent());

}}

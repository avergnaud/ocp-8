package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0687 {

public static void main(String... args) {

Path p2 = Paths.get("/home/ubuntu/dev/git/../");

out.println("getParent: " + p2.getParent());
out.println("getRoot: " + p2.getRoot());
out.println("getName(0): " + p2.getName(0));

}}

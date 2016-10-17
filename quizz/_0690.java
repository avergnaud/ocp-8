package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class _0690 {

public static void main(String... args) {

File f = new File(".");
out.println(f.exists());
out.println(Arrays.toString(f.listFiles()));

}}

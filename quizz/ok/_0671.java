package quizz;

import static java.lang.System.out;
import java.io.*;

public class _0671 {

public static void main(String... args) {

File file = new File("/i/dont/exist");

out.println(file.renameTo(new File("/i/neither")));

}}

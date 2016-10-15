package quizz;

import static java.lang.System.out;
import java.io.*;

public class _0435 {
public static void main(String... args) {

String s1 = File.separator;
String s2 = System.getProperty("file.separator");

out.println(s1.equals(s2));


}}

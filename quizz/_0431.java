package quizz;

import static java.lang.System.out;
import java.io.*;

/*
assume user dir is "/home/ubuntu/dev/git/avergnaud/ocp-8/"
assume someName.txt does not exists
*/
public class _0431 {
public static void main(String... args) {

File file = new File("someName.txt");
out.println(file.getAbsolutePath());
out.println(file.getName());
out.println(file.isFile());
String p = file.getParent();
out.println(p);

}}

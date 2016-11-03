package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

/*
assume /home/ubuntu/dev/git/avergnaud/ocp-8/quizz exists
*/
public class _0436 {
public static void main(String... args) {

File dir = new File("/home/ubuntu/dev/git/avergnaud/ocp-8");
File another = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/quizz");
out.println(dir.exists());
out.println(dir.isDirectory());
List<File> files = Arrays.asList(dir.listFiles());
out.println(files.contains(another));

}}

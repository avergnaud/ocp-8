package quizz;

import static java.lang.System.out;
import java.io.*;

/*
assume user dir is "/home/ubuntu/dev/git/avergnaud/ocp-8/"
assume someName.txt does not exists
*/
public class _0433 {
public static void main(String... args) {

File file = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/someName.txt");
file.renameTo("someOtherName.txt");
out.println(file.getName());
}}

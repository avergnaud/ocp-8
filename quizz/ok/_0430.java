package quizz;

import static java.lang.System.out;
import java.io.*;

/*
assume _0430.txt exists in the user's current directory
*/
public class _0430 {
public static void main(String... args) {

File parent = new File("nonexistingdirectory");
File child = new File(parent,"_0430.txt");
out.println(child.exists());

parent = null;
child = new File(parent,"_0430.txt");
out.println(child.exists());
}}

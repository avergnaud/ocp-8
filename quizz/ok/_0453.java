package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class _0453 {

public static void main(String... args) {

Console console = System.console();
char[] pwd1 = console.readPassword("enter pwd");
char[] pwd2 = console.readPassword("enter pwd");
if(Arrays.equals(pwd1,pwd2)) {
	console.writer().println("ok");
}
String name = console.readLine("what is your name?");
console.writer().println("entered: " + name);

console.writer().printf("again: %s%n", name);

console.writer().printf("bye");

}}

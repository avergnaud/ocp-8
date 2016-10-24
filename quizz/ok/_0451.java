package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class _0451 {

public static void main(String... args) {

File f = new File("0450");
try(PrintStream ps = new PrintStream(f);) {

ps.println("hello");

} catch(IOException e) {
out.println(e);
}

try(BufferedReader br = new BufferedReader(
	new FileReader(f));) {

out.println(br.readLine());

} catch(IOException e) {
out.println(e);
}


}}

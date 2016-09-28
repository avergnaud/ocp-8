package quizz;

import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class _0452 {

public static void main(String... args) {

File f = new File("0450");
try(PrintWriter pw = new PrintWriter(
	new FileOutputStream(f));) {

pw.println("hello");

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

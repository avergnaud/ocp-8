package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
this code appends to an existing file...
*/
public class _0501 {
	public static void main(String... args) {
		
try(PrintWriter pw = new PrintWriter(
	new BufferedWriter(
		new FileWriter("C:\\tmp\\hello.txt",true)));) {

pw.println("another way");

} catch(IOException e) {
out.println(e);
}

	}
}
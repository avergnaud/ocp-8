package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*

*/
public class _0483 {
	public static void main(String... args) {
		
		try {
			Files.move(
				Paths.get("nonexisting"),
				Paths.get("."));
		} catch (IOException e) {
			out.println("cannot move a non existing file");
		}
		
		try {
			Files.move(
				Paths.get(".").resolve(Paths.get("a")),/*assume a empty*/
				Paths.get(".").resolve(Paths.get("b")));
		} catch (IOException e) {
			out.println("cannot move accross drives");
		}
	}
}

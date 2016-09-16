package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0476 {
	public static void main(String... args) {
		try {
			Path current = Paths.get(".").toRealPath();
			out.println(current);
		} catch(IOException e) {
			out.println(e);
		}
	}
}
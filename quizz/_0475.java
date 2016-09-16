package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0475 {
	public static void main(String... args) {
		
		Path current = Paths.get(".").toRealPath();
		out.println(current);
	}
}
package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0470 {
	public static void main(String... args) {
		
		Path path = Paths.get("quizz");
		Path another = Paths.get("ch9");
		out.println(path.relativize(another));	
	}
}
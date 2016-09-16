package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0468 {
	public static void main(String... args) {
		
		Path path = Paths.get("D:\\dt\\avergnaud\\ocp-8\\quizz");
		out.println(path.subpath(0,0));
	}
}
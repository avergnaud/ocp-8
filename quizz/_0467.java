package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0467 {
	public static void main(String... args) {
		
		Path path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/quizz");
		out.println(path.subPath(0,2));
	}
}

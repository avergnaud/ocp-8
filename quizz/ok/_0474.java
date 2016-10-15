package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0474 {
	public static void main(String... args) {
		
		Path dt = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8");
		Path autre = Paths.get("/home/ubuntu/dev/git/avergnaud/test/autre");
		Path autreRelativeToDt = dt.relativize(autre);
		Path autre2 = dt.resolve(autreRelativeToDt);
		out.println(autre2);
	}
}

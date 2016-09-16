package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
D:\\dt\\avergnaud\\ocp-8\\ exists
*/
public class _0479 {
	public static void main(String... args) {
		File file = new File("D:\\dt\\avergnaud\\ocp-8\\a\\b\\c.txt");
		out.println(file.mkdir());
		out.println(file.mkdirs());
		out.println(file.mkdirs());

		Files.createDirectory(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
	}
}
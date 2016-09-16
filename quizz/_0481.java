package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
D:\\dt\\avergnaud\\ocp-8\\ exists
*/
public class _0481 {
	public static void main(String... args) {
		
		try {
			Files.createDirectory(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
		} catch (IOException e) {
			out.println(e);
		}
		try {
			Files.createDirectories(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
			Files.createDirectories(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
		} catch(IOException e) {
			out.println(e);
		}
	}
}
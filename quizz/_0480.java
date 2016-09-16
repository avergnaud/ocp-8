package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
D:\\dt\\avergnaud\\ocp-8\\ exists
*/
public class _0480 {
	public static void main(String... args) {
		
		try {
			Files.createDirectory(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
		} catch (IOException e) {
			out.println(e);
		}
		try {
			boolean b = Files.createDirectories(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
			out.println(b);
			b = Files.createDirectories(Paths.get("D:\\dt\\avergnaud\\ocp-8\\d\\e\\f.txt"));
			out.println(b);
		} catch(IOException e) {
			out.println(e);
		}
	}
}
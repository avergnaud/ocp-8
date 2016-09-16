package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0473 {
	public static void main(String... args) {
		
		Path path = Paths.get("test");
		Path another = Paths.get("D:\\dt\\avergnaud\\ocp-8\\quizz");
		out.println(path.resolve(another));	
	}
}
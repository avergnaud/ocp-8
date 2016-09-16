package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0472 {
	public static void main(String... args) {
		
		Path path = Paths.get("D:\\dt\\avergnaud\\ocp-8\\quizz");
		Path another = Paths.get("ocp-8");
		out.println(path.relativize(another));	
	}
}
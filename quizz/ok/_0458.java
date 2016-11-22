package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.net.*;

public class _0458 {
	public static void main(String... args) {
		try {
			Path path = Paths.get(new URI("file:///D:\\dt\\avergnaud\\ocp-8\\ch9"));
		} catch(URISyntaxException e) {
			out.println(e);
		}
	}
}
package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.net.*;

public class _0459 {
	public static void main(String... args) {
		try {
			Path path = Paths.get(new URI("file:///D:/dt/avergnaud/ocp-8/ch9"));
			Path another = Paths.get("D:\\dt\\avergnaud\\ocp-8\\ch9");
			out.println(path.equals(another));
		} catch(URISyntaxException e) {
			out.println(e);
		}
	}
}
package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*assume /home/ubuntu/dev/git/avergnaud/ocp-8 exists*/
public class _0477 {
	public static void main(String... args) {
		File file = new File("/home/ubuntu/dev/git/avergnaud/ocp-8");
		out.println(file.exists());
		Path path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8");
		out.println(Files.exists(path));
	}
}

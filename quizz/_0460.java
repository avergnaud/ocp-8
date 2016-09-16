package quizz;

import static java.lang.System.out;
import java.nio.file.*;

public class _0460 {
	public static void main(String... args) {
		Path p1 = FileSystems.getDefault().getPath("C:");
		Path p2 = Paths.getPath("C:");
		out.println(p1.equals(p2));
	}
}
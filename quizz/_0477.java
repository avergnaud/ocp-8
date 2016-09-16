package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*assume D:\\dt exists*/
public class _0477 {
	public static void main(String... args) {
		File file = new File("D:\\dt");
		out.println(file.exists());
		Path path = Paths.get("D:\\dt");
		out.println(Files.exists(path));
	}
}
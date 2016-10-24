package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _00011 {
	public static void main(String... args) {

		try {
			Stream<Path> paths = Files.walk(Paths.get("quizz"));
			Map<String,Long> map = paths.collect(Collectors.groupingBy(
				path->path.getFileName().substring(0,4),
				Collectors.counting()
			));
			out.println(map);
		} catch(IOException e) {out.println(e);}


	}
}

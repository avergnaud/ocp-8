package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class _00012 {
	public static void main(String... args) {

		try {
			Stream<Path> paths = Files.walk(Paths.get("quizz"),1);
			TreeMap<String,Long> map = paths.collect(Collectors.groupingBy(
				path-> {
					if(path.getFileName().toString().endsWith(".java")) {
						return path.getFileName().toString().substring(0,3);
					}
					return "compte pas";
				},
				TreeMap::new,
				Collectors.counting()
			));
			out.println(map);
		} catch(IOException e) {out.println(e);}


	}
}

package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.time.*;
import java.nio.file.attribute.*;

/*
list the files directly under /home/ubuntu/dev/git/avergnaud/ocp-8/misc
3 ways...
*/
public class _0518 {

	public static void main(String... args) {

Path misc = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/misc");

try {

Files.list(misc)
	.filter(path->Files.isRegularFile(path))
	.forEach(out::println);

} catch(IOException e) {
out.println(e);
}

	}
}
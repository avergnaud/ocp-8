package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.time.*;
import java.nio.file.attribute.*;

/*
get all .java files modified between [15/07/2016,15/08/2016] inside:
/home/ubuntu/dev/git/avergnaud/ocp-8/
*/
public class _0512 {

static boolean myBiPredicateTest(Path path, BasicFileAttributes attributes) {
/*
assume [15/07/2016,15/08/2016] is [1468576800000,1471255200000]
*/

FileTime ft = attributes.lastModifiedTime();

return path.toString().endsWith("java")
	&& ft.toMillis() > 1468576800000L
	&& ft.toMillis() < 1471255200000L;
}

	public static void main(String... args) throws IOException {
		
Files.find(Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/"),
		10,
		_0512::myBiPredicateTest)
	.forEach(out::println);



	}
}

package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

/*
print all .java files in
/home/ubuntu/dev/git/avergnaud/ocp-8/ch2/lambda
*/
public class _0509 {
	public static void main(String... args) {
		

Stream<Path> stream = null;

try {
Path root = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch2/lambda")
	.toRealPath();
stream = Files.find(
	root,
	2,
	(path,attr)->path.toString().endsWith("java"));
} catch (IOException e) {out.println(e);}

if(stream != null)	
	stream.forEach(out::println);

	}
}

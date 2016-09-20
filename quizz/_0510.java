package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

/*
walk
/home/ubuntu/dev/git/avergnaud/ocp-8/ch2/
*/
public class _0510 {
	public static void main(String... args) {
		

Files.walk(Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch2/"))
	.forEach(out::println);


	}
}

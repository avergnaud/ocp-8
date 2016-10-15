package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
/home/ubuntu/dev/git/avergnaud/ocp-8
assume user current directory is /home/ubuntu/dev/git/avergnaud/ocp-8
*/
public class _0465 {
	public static void main(String... args) {
		
		Path path = Paths.get("avergnaud/ocp-8/quizz");
		out.println(path.getRoot());
		out.println(path.getFileName());
	}
}

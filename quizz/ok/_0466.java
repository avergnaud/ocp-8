package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
D:\dt\avergnaud\ocp-8\quizz
assume user current working directory is D:\dt\avergnaud\ocp-8\
*/
public class _0466 {
	public static void main(String... args) {
		
		Path path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/quizz");
		Path absolute = path.toAbsolutePath();
		out.println(path == absolute);
		
		path = Paths.get("quizz");
		absolute = path.toAbsolutePath();
		out.println(absolute);
		out.println(path.equals(absolute));
	}
}

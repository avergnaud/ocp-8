package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
D:\dt\avergnaud\ocp-8\quizz
assume user current directory is D:\dt\avergnaud\ocp-8\
*/
public class _0462 {
	public static void main(String... args) {
		Path path = Paths.get("quizz");
		Path parent = path.getParent();
		out.println(parent);
		out.println(path.getRoot());
		
		//path = Paths.get("D:\\dt\\avergnaud\\ocp-8\\quizz");
		path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/quizz");
		out.println(path.getParent());
		out.println(path.getRoot());
		out.println(path.getName(0));
		out.println(path.getFileName());
	}
}

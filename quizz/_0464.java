package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
/home/ubuntu/dev/git/avergnaud/ocp-8
assume user current directory is /home/ubuntu/dev/git/avergnaud/ocp-8
*/
public class _0464 {
	public static void main(String... args) {
		
		Path path = Paths.get("ocp-8/quizz");
		for(int i=0;i<path.getNameCount();i++) {
			out.println(path.getName(i));
		}
		out.println();
		Path current = path;
		while((current = current.getParent()) != null) {
			out.println(current);
		}
	}
}

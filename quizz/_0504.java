package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

/*
retrieve all file metadata attributes in a view
/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt
*/
public class _0504 {
	public static void main(String... args) {
		




Path file = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt");

try {

BasicFileAttributes bfa = Files.readAttributes(
	file,
	BasicFileAttributes.class);

out.println(bfa.isDirectory());
out.println(bfa.isRegularFile());
out.println(bfa.isSymbolicLink());
out.println(bfa.isOther());

out.println(bfa.size());
out.println(bfa.lastModifiedTime());
out.println(bfa.lastAccessedTime());

} catch(IOException e) {
out.println(e);
}


	

	}
}

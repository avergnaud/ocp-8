package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

/*
retrieve all file metadata attributes in a view
/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt
*/
public class _0505 {
	public static void main(String... args) {
		




Path file = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt");

try {

BasicFileAttributeView bfav = Files.getFileAttributeView(
	file,
	BasicFileAttributeView.class);

} catch(IOException e) {
out.println(e);
}


	

	}
}

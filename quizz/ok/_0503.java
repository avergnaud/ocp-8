package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

/*
assume /home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt exists
*/
public class _0503 {
	public static void main(String... args) {
		
try {

Path path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt");
UserPrincipal up = Files.getOwner(path);
out.println(up.getName());

} catch(IOException e) {
out.println(e);
}

	}
}

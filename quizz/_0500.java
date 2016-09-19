package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

/*
this code appends to an existing file...
*/
public class _0500 {
	public static void main(String... args) {
		
try {

Files.write(Paths.get("C:\\tmp\\hello.txt"),
	"une ligne en plus\n".getBytes(),
	StandardOpenOption.APPEND);

} catch (IOException e) {
out.println(e);
}

	}
}
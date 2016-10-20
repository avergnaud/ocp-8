package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.time.*;

/*
create dir
create file
append line
*/
public class _04881 {
	public static void main(String... args) {

try {

	Files.write(Paths.get("/home/ubuntu/dev/tmp/hello.txt"),
		"then".getBytes());

} catch(IOException e) {
	out.println(e);
}



	}
}

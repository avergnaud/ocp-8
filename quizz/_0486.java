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
public class _0486 {
	public static void main(String... args) {

String current = ""+ LocalTime.now().getNano();
try {
	Files.createDirectories(Paths.get("/home/ubuntu/dev/tmp/" + current));

	Files.write(Paths.get("/home/ubuntu/dev/tmp/" + current + "/hello.txt"),
		"something",
		StandardOpenOption.APPEND);

} catch(IOException e) {
	out.println(e);
}



	}
}

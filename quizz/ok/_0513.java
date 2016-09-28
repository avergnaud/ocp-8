package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.time.*;
import java.nio.file.attribute.*;

/*
list the files directly under /home/ubuntu/dev/git/avergnaud/ocp-8/misc
3 ways...
*/
public class _0513 {

	public static void main(String... args) {

File file = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/misc");

try {
out.println(file.isDirectory());
} catch(IOException e) {
out.println(e);
}

	}
}

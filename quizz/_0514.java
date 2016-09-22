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
public class _0514 {

	public static void main(String... args) {

File file = new File("/home/ubuntu/dev/git/avergnaud/ocp-8/misc");

out.println(file.isDirectory());
File[] liste = file.listFiles();
for(File f : liste)
	out.println(f);

	}
}

package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.*;

/*
assume /home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt exists
*/
public class _0499 {
	public static void main(String... args) {

Path path = Paths.get("/home/ubuntu/dev/git/avergnaud/ocp-8/ch8Print.txt");

try {
long mil = Files.getLastModifiedTime(path).toMillis();
out.println(mil);
long then = mil + 1_000_000_000;
out.println(then);
//Files.setLastModifiedTime(path, then);
Files.setLastModifiedTime(path, FileTime.fromMillis(then));
} catch(IOException e) {out.println(e);}

	}
}

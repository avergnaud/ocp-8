package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
import java.util.*;
import java.nio.file.attribute.*;

/*
prints itself twice
*/
public class _0519 {

	public static void main(String... args) {

Path thisFile = Paths.get(".").resolve(Paths.get("quizz/_0519.java"));

try {
//1
List<String> liste = Files.readAllLines(thisFile);
out.println(liste);

out.println();

//2
Files.lines(thisFile)
	.forEach(out::println);

} catch(IOException e) {out.println(e);}

	}
}

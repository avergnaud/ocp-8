package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.*;

/*
a program that prints itself
*/
public class _0491 {
	public static void main(String... args) throws IOException {

Path curr = Paths.get(".").toRealPath();
Path rel = Paths.get("quizz/_0491.java");
Path full = curr.resolve(rel);

List<String> liste = Files.readAllLines(full);

for(String s : liste)
	out.println(s);

	}
}

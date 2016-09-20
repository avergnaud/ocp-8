package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
/*
a program that prints itself
*/
public class _0489 {
	public static void main(String... args) throws IOException {

Path curr = Paths.get(".").toRealPath();
Path rel = Paths.get("quizz/_0489.java");
Path full = curr.resolve(rel);

try(BufferedReader br = Files.newBufferedReader(full);) {

while((String s = br.readLine()) != null) {
out.println(s);
}

}

	}
}

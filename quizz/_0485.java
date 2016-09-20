package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0485 {
	public static void main(String... args) {

Path nonexistent = Paths.get("/nonexistent");

try {
Files.deleteIfExists(nonexistent);
} catch(DirectoryNotEmptyException e) {
out.println(e);
}		

	}
}

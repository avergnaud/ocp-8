package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class _0494 {
	public static void main(String... args) {

out.println(Files.isReadable(Paths.get("/sorry/do/not/exist")));
out.println(Files.isExecutable(Paths.get("/sorry/do/not/exist")));

	}
}

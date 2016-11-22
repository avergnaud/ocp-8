package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class _0496 {
	public static void main(String... args) throws IOException {

Path p = Paths.get(".");
out.println(Files.size(p));
out.println(p.toRealPath());
	}
}

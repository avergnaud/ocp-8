package ch9;

import static java.lang.System.out;
import java.nio.file.*;

public class p459 {
	public static void main(String... args) {
		Path p1 = FileSystems.getDefault().getPath("C:");
		Path p2 = Paths.get("C:");
		out.println(p1.equals(p2));
	}
}
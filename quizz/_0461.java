package quizz;

import static java.lang.System.out;
import java.nio.file.*;
import java.io.*;

public class _0461 {
	public static void main(String... args) {
		Path p1 = Paths.get("D:\\dt\\avergnaud\\ocp-8\\checkup");
		out.println(p1.toString());
		for(int i=0;i<p1.getNameCount();i++) {
			Path p = p1.getName(i);
			out.println("element " + i + ": " + p);
		}
	}
}
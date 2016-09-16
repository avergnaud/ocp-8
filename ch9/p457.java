package ch9;

import static java.lang.System.out;
import java.nio.file.*;

public class p457 {
	public static void main(String... args) {
		Path path = Paths.get("D:\\dt\\avergnaud\\ocp-8\\ch9");
		Path another = Paths.get("ch9");
		Path third = Paths.get("D:","dt","avergnaud","ocp-8","ch9");
		out.println(path.equals(another));
		out.println(another.equals(third));
		out.println(path.equals(third));
		
		
	}
}
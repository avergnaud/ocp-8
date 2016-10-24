package quizz;

import static java.lang.System.out;
import java.util.*;

public class _01612 {

public static void main(String... args) {
	List<String> l = Arrays.asList("one","two");
	get(l);
	String first = l.get(0);
	out.println(first);
}

static <T> void get(T... t) {
Object[] o = t;
o[0] = Arrays.asList(1,2);
}

}

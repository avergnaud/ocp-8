package quizz;

import static java.lang.System.out;
import java.util.*;

public class _01611 {

public static void main(String... args) {
	List<String> l = Arrays.asList("one","two");
	get(l);
	String first = l.get(0);
}

static <T> void get(T... t) {
Object[] o = t;
out.println(Arrays.toString(o));
out.println(o[0]);
}

}

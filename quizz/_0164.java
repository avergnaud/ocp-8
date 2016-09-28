package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0164 {

public static void main(String... args) {
	List<String> l = Arrays.asList("one","two");
	get(l);
	String first = l.get(0);
}

static <T> void get(T... t) {
Object[] o = t;	
o[0] = new Integer(1);
}

}














//http://stackoverflow.com/questions/26190476/converting-an-array-of-primitives-to-list-using-arrays-aslist

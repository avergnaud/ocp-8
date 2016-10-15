package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0570 {

static String MyBiFunction(Integer k, String value) {
	out.println("k: " + k + ". value: " + value);
	return "nouvelle";
}

public static void main(String... args) {

Map<Integer,String> m = new HashMap<>();
m.put(1,"un");
m.put(2,"deux");
out.println(m);
m.compute(2,_0570::MyBiFunction);
out.println(m);

}}


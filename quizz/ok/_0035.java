package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0035 {

public static void main(String... args) {

List<String> l1 = Arrays.asList("10","11","12");

print(l1);

}

static void print(List<Object> liste) {
for(Object o : liste)
	out.println(o.toString());
}

}

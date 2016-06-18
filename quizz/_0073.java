package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0073 {

/*FLAT*/
public static void main(String... args) {

List<Integer> liste = Arrays.asList(1,2,3);

Stream<Integer> st = Stream.of(
	Arrays.asList(1),
	Arrays.asList(2),
	Arrays.asList(3))
	.flatMap(liste->liste.stream())
	.map(i->i*2);

st.forEach(out::println);

}
}

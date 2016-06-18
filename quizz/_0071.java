package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0071 {

public static void main(String... args) {

Optional<Integer> oi = Optional.of(1)
	.filter(x -> x > 1)
	.map(i -> i*2);

out.println(oi.isPresent());

}
}

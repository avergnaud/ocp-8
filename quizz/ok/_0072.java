package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0072 {

public static void main(String... args) {

Optional<Integer> oi = Optional.of(1)
	.map(i -> null);

out.println(oi.isPresent());

}
}

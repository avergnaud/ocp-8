package quizz;

import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

public class _0107 {
public static void main(String... args) {

List<String> some = Arrays.asList("adjdlj","1dzdz","aa","444");

Stream<String> other = some.stream()
	.filter(s -> s.length() < 4)
	.forEach(out::println);

}
}
package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0077 {

public static void main(String... args) {

Optional<String> optionalInput = Optional.of("toto");

Optional<String> o = Optional.of("")
	.flatMap(string->optionalInput);

o.ifPresent(out::println);

}
}

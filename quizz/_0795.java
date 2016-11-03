package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class _0795 {

public static void main(String... args) {

Random rand = new Random();
Optional<Integer> oi = Stream.generate(rand.nextInt(1000))
	.limit(100)
	.max();

}}

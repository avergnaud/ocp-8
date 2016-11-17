package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0783 {

public static void main(String... args) {

List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17);

Map<Boolean,Long> repartition = primes
	.stream()
	.collect(
		Collectors.partitioningBy(
			i -> i>10,
			Collectors.counting()
		)	
	);
out.println(repartition);

}}

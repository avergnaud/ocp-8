package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0400 {
public static void main(String... args) {

List<Integer> data = Collections.synchronizedList(new ArrayList<>());

Stream.of(1,2,3,4,5,6,7)
	.parallel()
	.forEachOrdered(out::print)
	.map(i -> {data.add(i);return i;})
	.count();

out.println("");
out.println(data);

}}

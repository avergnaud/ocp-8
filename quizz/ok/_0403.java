package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0403 {
public static void main(String... args) {

List<Integer> data = new ArrayList<>();

Stream.of(1,2,3,4,5,6,7)
	.parallel()
	.peek(i->{data.add(i);})
	.count();

out.println(data);

}}

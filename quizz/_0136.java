package quizz;

import java.util.stream.*;

public class _0136 {
public static void main(String... args) {

Integer[] myA = Stream.<Integer>of(1,2,3,4)
	.collect(Collectors.toList())
	.toArray();

}}

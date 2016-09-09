package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0407 {
public static void main(String... args) {

String result = Stream.of("1 ","2 ","3 ")
	.reduce("",
		String::concat,
		String::concat);
out.println(result);

result = Stream.of("1 ","2 ","3 ")
	.collect(String::new,
		String::concat,
		String::concat);
out.println(result);

}}

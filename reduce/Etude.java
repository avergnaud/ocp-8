package reduce;

import static java.lang.System.out;
import java.util.stream.*;

public class Etude {
public static void main(String... args) {

out.println(Runtime.getRuntime().availableProcessors() + " available processors");
System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","2");

String r = Stream.iterate('a',myChar->++myChar)
	.limit(26)
	.map(String::valueOf)
	.parallel()
	.peek(s -> out.println(Thread.currentThread().getName() + " peeks: " + s))
	.reduce("_",
		(s1,s2) -> {
			out.println(Thread.currentThread().getName() + " accumulates " + s1 + " " + s2);
			return s1.concat(s2);},
		(s1,s2) -> {
			out.println(Thread.currentThread().getName() + " combines " + s1 + " " + s2);
			return s1.concat(s2);});

out.println(r);
}}

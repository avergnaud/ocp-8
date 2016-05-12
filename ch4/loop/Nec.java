package ch4.loop;

import java.util.stream.*;
import java.util.function.*;
import static java.lang.System.out;

public class Nec {
public static void main(String... args) {

// a loop with an if statement should be a filter

//loop with an if
Stream<String> my = Stream.of("un","deux","trois");
Consumer<String> consumer = s -> {
	if(s.startsWith("t")) {
		out.println(s);
	}
};
my.forEach(consumer);

//filter
my = Stream.of("un","deux","trois");
my.filter(s -> s.startsWith("t")).forEach(out::println);

}}
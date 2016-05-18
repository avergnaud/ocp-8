package ch4.intermediate;

import static java.lang.System.out;
import java.util.stream.Stream;

public class MapMethod {
public static void main(String... args) {

Integer one = Integer.valueOf("1");
out.println(one);

Stream<String> strings = Stream.of("1","2","3");
Stream<Integer> ints = strings.map(s->Integer.valueOf(s));
ints.forEach(out::print);

}}

package ch4;

import java.util.stream.Stream;
import java.util.*;

public class StreamCrea {
public static void main(String... args) {

Stream<Integer> s = Stream.empty();
s = Stream.of(1);
s= Stream.of(1,2,3);

List<Integer> l = Arrays.asList(1,2,3);
s = l.stream();

Stream<Double> d = Stream.generate(Math::random);

s = Stream.iterate(1, n->n+2);

}
}
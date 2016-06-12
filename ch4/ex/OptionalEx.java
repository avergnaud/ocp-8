package ch4.ex;

import java.util.Optional;
import static java.lang.System.out;

public class OptionalEx {
public static void main(String... args) {

Optional<Integer> o = Optional.empty();
print(o);

o = Optional.of(1);
print(o);

o = Optional.of(123);
print(o);

}

private static void print(Optional<Integer> opt) {

opt.filter(i-> 99<i && i<=999)
	.ifPresent(out::println);

}

}

package ch4.optionals;

import java.util.Optional;
import java.util.OptionalInt;
import static java.lang.System.out;

public class Exos {
public static void main(String... args) {

test(Optional.empty());
test(Optional.of(1));
test(Optional.of(383));

another(Optional.empty());
another(Optional.of(1));
another(Optional.of(383));

}

public static void test(Optional<Integer> o) {
o.filter(i-> i>99 && i<1000).ifPresent(out::println);
}

public static void another(Optional<Integer> o) {
o.map(i->""+i).filter(s->s.length()==3).ifPresent(out::println);
}

public static OptionalInt getLength(Optional<String> o) {

}

}
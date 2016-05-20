package ch4;

import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

public class OptionalPrims {
public static void main(String... args) {

/* Optional Objects */
Optional<Double> od = Optional.empty();
//out.println(od.get());
od.ifPresent(out::println);
//out.println(od.orElseGet(()->Double.valueOf(0)));

/* Optional primitive */
OptionalDouble odprim = OptionalDouble.empty();
double d = odprim.orElseGet(()->1.0);
IntStream intS = IntStream.iterate(0,i->i+1).limit(100);
OptionalDouble avg = intS.average();
avg.ifPresent(out::println);

int sum = IntStream.iterate(1,i->i+1)
	.limit(100)
	.sum();
out.println(100*101/2);
out.println(sum);

OptionalDouble another = OptionalDouble.of(1.0);
//out.println(another.get());
out.println(another.getAsDouble());

}}

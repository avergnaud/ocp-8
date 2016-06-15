package ch4.gen;

import java.util.stream.Stream;
import static java.lang.System.out;
import java.util.Optional;

public class Review {
public static void main(String... args) {

//Stream<T>

/*

reduce
collect

*/

// Optional<T> reduce(BinaryOperator<T> accumulator)

Stream<Integer> s = Stream.of(1,2,3,4);
Optional<Integer> o = s.reduce((a,b)->a+b);
o.ifPresent(out::println);

// T reduce(T seed, BinaryOperator<T> acc)
s = Stream.of(1,2,3,4,5);
Integer i = s.reduce(1,(a,b)->a+b);
out.println(i);

// <R> R reduce(R seed,
//	BiFunction<R, ? super T, R> accumulator,
//	BinarayOperator<R> combiner)

s = Stream.of(1,2,3,4,5);
String res = s.reduce("",
	(string, integer)->string+integer,
	String::concat);

// <R> collect(
//	Supplier<R> supplier,
//	BiConsumer<R, ? super T> consumer,
//	BiCOnsumer<R> combiner)

Stream<String> s2 = Stream.of("one "," two ", "three");
StringBuilder sbuilder = s2.collect(
	StringBuilder::new,
	(sb,st) -> sb.append(st),
	(sb1,sb2) -> sb1.append(sb2));
out.println(sbuilder);

}}

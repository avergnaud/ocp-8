package ch4.loop;

import java.util.stream.*;
import java.util.function.*;
import static java.lang.System.out;

public class Red3 {
public static void main(String... args) {

/* <U> U reduce(U identity, 
	BiFunction<U, ? super T,U> accumulator,
	BinaryOperator<U> combiner)
*/
Stream<Integer> stream = Stream.of(1,1,1);

String identity = "";

BiFunction<String,Integer,String> accumulator =
	(s,i) -> s + i;

BinaryOperator<String> combiner = 
	(s1,s2) -> s1 + s2;

/*The identity value must be an identity for the combiner function. 
This means that for all u, combiner(identity, u) is equal to u. 
Additionally, the combiner function must be compatible with the accumulator 
function; for all u and t, the following must hold:

combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)*/

String u = "deux";
Integer t = 2;
String first = combiner.apply(u,accumulator.apply(identity, t));
String second = accumulator.apply(u, t);

out.println(first);
out.println(second);

String alors = stream.reduce(identity,accumulator,combiner);
out.println(alors);

}}
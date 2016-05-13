/*

?
the point is: "collect performs a mutable reduction operation on the elements of this stream. 
A mutable reduction is one in which the reduced value is a mutable result container
?

https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BiConsumer-
http://www.developpez.net/forums/d1448545/java/general-java/debuter/java-8-streams-reduce-trois-arguments/

*/
package ch4.parallelstuff;

import java.util.*;
import static java.lang.System.out;

public class ReduceVsCollect {
public static void main(String... args) {

/*the problem with reduce:*/
List<String> liste = Arrays.asList(" 1 "," 2 "," 3 "," 4 ");
StringBuilder resultat = liste.parallelStream()
	.reduce(
		new StringBuilder(),
		StringBuilder::append,
		StringBuilder::append
	);
out.println(resultat.toString());

/*is resolved with collect:*/
StringBuilder resultat2 = liste.parallelStream()
	.collect(
		StringBuilder::new,
		StringBuilder::append,
		StringBuilder::append
	);
out.println(resultat2.toString());

}}
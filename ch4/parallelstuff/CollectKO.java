package ch4.parallelstuff;

import java.util.stream.*;
import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;

public class CollectKO {
public static void main(String... args) {

List<String> someList = Arrays.asList(" 1 ", " 2 ", " 3 ", " 4 ");

Stream<String> pStream = someList.parallelStream();
String immutableOk = pStream.reduce("", String::concat);
//out.println(immutableOk);

/*
"The process of reducing always results in the the type as the stream. 
Collecting is used when you want to collect the results into a mutable 
container, i.e. when the result is a different type to the stream"

But :
<U> U reduce(U identity, 
	     BiFunction<U,? super T,U> accumulator, 
	     BinaryOperator<U> combiner)
*/

ForkJoinPool commonPool = ForkJoinPool.commonPool();
out.println(commonPool.getParallelism() + " physical CPU cores available\n");

out.println("---------------------------------------------------");
pStream = someList.parallelStream();
StringBuilder mutable = pStream.reduce(new StringBuilder(),
			(sb,s)-> {
				out.println(Thread.currentThread().getName() + " - accumulator(" + sb.toString() + "," + s + ")");
				return sb.append(s);
				},
			(sb1,sb2)-> {
				out.println(Thread.currentThread().getName() + " - combiner(" + sb1.toString() + "," + sb2.toString() + ")");
				return sb1.append(sb2);
				});
out.println("---------------------------------------------------");
out.println(mutable.toString());
out.println("---------------------------------------------------");

/*
WHY KO ?

The identity value must be an identity for the combiner function. 
This means that for all u, combiner(identity, u) is equal to u. 
*/
BiFunction<StringBuilder,String,StringBuilder> accumulator = (sb,s)-> {
					out.println("DEBUG accumulator(" + sb.toString() + "," + s + ")");
					return sb.append(s);
				};
BinaryOperator<StringBuilder> combiner = (sb1,sb2)-> {
					out.println("DEBUG combiner(" + sb1.toString() + "," + sb2.toString() + ")");
					return sb1.append(sb2);
				};

StringBuilder test1 = combiner.apply(new StringBuilder(),new StringBuilder("hello"));
StringBuilder test2 = combiner.apply(new StringBuilder(),new StringBuilder("world"));
out.println(test1.toString());//OK
out.println(test2.toString());//OK

/*
Additionally, the combiner function must be compatible with the accumulator function; 
for all u and t, the following must hold:

     combiner.apply(u, accumulator.apply(identity, t)) == accumulator.apply(u, t)
*/
out.println("");
out.println(combiner.apply(new StringBuilder("hello"), accumulator.apply(new StringBuilder(), "world")));
out.println("");
out.println(accumulator.apply(new StringBuilder("hello"), "world"));
//OK

/*

KO because of mutable state of the StringBuilder. Shared in memory by all threads.

*/


}}
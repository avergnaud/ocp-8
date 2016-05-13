package ch4.parallelstuff;

import java.util.*;
import java.util.concurrent.*;

public class SimpleReds {
public static void main(String... args) {

List<Integer> liste = Arrays.asList(1,2,3,4,5);

Integer produit = liste.parallelStream()
			.reduce(1,
				(a,b)->a*b,
				(a,b)->a*b);
//System.out.println(produit);

String autre = liste.parallelStream()
			.reduce("",
				(integer,string) -> string + integer,
				String::concat);
//System.out.println(autre);

//"is not constrained to execute sequentially"
Integer another = liste.parallelStream()
			.reduce(1,
				(a,b)-> {
					//System.out.println(Thread.currentThread().getName());
					return a*b;
					}
				);
//System.out.println(another);

Optional<Integer> last = liste.parallelStream().reduce((a,b)->a*b);
last.ifPresent(System.out::println);

}}

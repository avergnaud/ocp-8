package ch3.mapmethods;

import java.util.*;
import java.util.function.*;

public class FullRecap {
public static void main(String... args) {

/* merge */
Map<Integer,String> my = new HashMap<>();
my.put(1,"un");
my.put(2,"deux");
my.put(3,"trois");

BiFunction<String,String,String> fun = (s1,s2) 
	->  {System.out.println("BiFunction called");
		return s1;};

/*
my.merge(3,null,fun);
my.merge(4,null,fun);
cas "value null
pour HashMap : NPE sytématique
*/

my.merge(4,"quatre",fun);
//System.out.println(my);

my.put(5,null);

my.merge(5,"cinq",fun);
System.out.println(my);

my.put(6,null);
fun = (s1,s2) 
	->  {System.out.println("BiFunction called");
		return null;};
my.merge(6,"six",fun);
System.out.println(my);

}
}
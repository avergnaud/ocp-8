package ch7;

import static java.lang.System.out;
import java.util.stream.*;

public class ReduceRequire {

static Stream<Integer> get() {
return Stream.iterate(0,n->++n).limit(11);
}

public static void main(String... args) {

/*
<U> U reduce(U identity, 
	BiFunction<U, ? super T,U> acc
	BinaryOperator<U> combiner)
*/

/* combiner(u,identity) == u
acc(x,acc(y,z)) == acc(acc(x,y),z)
combiner(u,acc(identity,t)) == acc(u,t) */

Integer t1 = get().reduce(
	0,
	(i,j)->i+j,
	(i,j)->i+j);
out.println(t1);

/*
0+t=t
a-(b-c) != (a-b)-c
a+(0-b)==a-b
*/
Integer t2 = get().reduce(
	0,
	(i,j)->i-j,
	(i,j)->i+j);
out.println(t2);

out.println("parallel OK !!!");
Integer t3 = get().parallel().reduce(
	0,
	(i,j)->i-j,
	(i,j)->i+j);
out.println(t3);

out.println("parallel 2 args method");
Integer t4 = get().parallel().reduce(
	0,
	(i,j)->i-j);
out.println(t4);
}}

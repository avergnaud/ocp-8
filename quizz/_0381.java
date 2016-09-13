package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0381 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

out.println("Gauss: " + MAX*(MAX+1)/2);//500000500000

long sum = 0L;
for(long i=0;i<=MAX;i++) {
sum = sum + i;
}
out.println("For loop: " + sum);

/*https://youtu.be/hSIhx_5CFj0?t=27m54s with parallel ?*/
Long anotherResult = Stream.iterate(0L, l->++l)
	.limit(MAX+1)
	.reduce(
		0L,
		(tmpSum1,l)->tmpSum1+l,
		(tmpSum1,tmpSum2)->tmpSum1+tmpSum2);

out.println("With a stream of Long: " + anotherResult);

}}



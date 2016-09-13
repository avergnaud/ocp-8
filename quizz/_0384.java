package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0384 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

out.println("Gauss: " + MAX*(MAX+1)/2);//500000500000

long sum = 0L;
for(long i=0;i<=MAX;i++) {
sum = sum + i;
}
out.println("For loop: " + sum);

Long another = LongStream.rangeClosed(0,MAX)
	.collect(Collectors.summingLong(l->l));

out.println("With a LongStream: " + another);

}}



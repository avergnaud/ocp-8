package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class _0385 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

out.println("Gauss: " + MAX*(MAX+1)/2);//500000500000

long sum = 0L;
for(long i=0;i<=MAX;i++) {
sum = sum + i;
}
out.println("For loop: " + sum);

//complicated
ObjLongConsumer<Long[]> accumulator = (longArray,l)->longArray[0]+=l;
BiConsumer<Long[],Long[]> combiner = (arr1,arr2)-> arr1[0]+=arr2[0];
Long[] another = LongStream.rangeClosed(0,MAX)
	.collect(()->new Long[]{new Long(0)},
		accumulator,
		combiner);
out.println("With a LongStream: " + another[0]);

}}



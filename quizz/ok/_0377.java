package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0377 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

out.println("Gauss: " + MAX*(MAX+1)/2);//500000500000

long sum = 0L;
for(long i=0;i<=MAX;i++) {
sum = sum + i;
}
out.println("For loop: " + sum);

sum = 0L;
LongStream.rangeClosed(0,MAX)
	.forEach(i->{sum=sum+i;});
out.println(sum);


}}



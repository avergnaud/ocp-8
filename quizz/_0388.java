package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0388 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

out.println("Gauss: " + MAX*(MAX+1)/2);//500000500000

long sum = 0L;
for(long i=0;i<=MAX;i++) {
sum = sum + i;
}
out.println("For loop: " + sum);

AtomicLong res = new AtomicLong(0L);
LongStream.rangeClosed(0,MAX)
	.parallel()
	.forEach(l->res.addAndGet(l));

out.println("With atomic long: " + res);

/*
very slow / consuming
https://youtu.be/hSIhx_5CFj0?t=26m53s
*/

}}



package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _03781 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

//500000500000

long[] ref = {0L};
LongStream.rangeClosed(0,MAX)
	.forEach(l->ref[0]+=l);
out.println("forEach: " + ref[0]);

long l = 0L;
LongStream.rangeClosed(0,MAX)
	.forEach(l2->l = l + l2);
out.println(l);

}}

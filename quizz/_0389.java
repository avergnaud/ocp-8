package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class _0389 {

private static final long MAX = 1_000_000;

public static void main( String[] args){

String result = Stream.of("w","o","l","f")
	.reduce("",String::concat);
out.println(result);

Integer prod = Stream.of(1,2,3,4)
	.reduce(new Integer(1),
		(i,j)->i*j);
out.println(prod);

}}



package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0373 {
public static void main( String[] args){

IntStream.range(0,10)
	.forEach(out::print);

out.println("");

IntStream.rangeClosed(0,10)
	.forEach(out::print);

}}



package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0371 {

public static void main( String[] args){

List<Integer> data = Collections.synchronizedList(new ArrayList<>());

Arrays.asList(1,2,3,4,5,6,7)
	.parallelStream()
	.map(i->{data.add(i);return i;})
	.forEachOrdered(out::print);

out.println("\n"+data);

}}



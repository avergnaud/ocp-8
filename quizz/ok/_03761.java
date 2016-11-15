package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _03761 {

public static void main( String[] args){

List<String> peeked = new ArrayList<>();

List<String> l = IntStream.range(0,20)/*ordered data*/
	.parallel()
	.filter(i->i%3==0)
	.mapToObj(String::valueOf)
	.peek(peeked::add)
	.collect(Collectors.toList());/*ordered collection*/
out.println(l);

out.println(peeked);

}}



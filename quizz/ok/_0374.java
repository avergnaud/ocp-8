package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0374 {
public static void main( String[] args){

List<String> peeked = new ArrayList<>();

List<String> l = IntStream.range(0,20)
	.parallel()
	.filter(i->i%3==0)
	.mapToObj(i->""+i)
	.peek(s->peeked.add(s))
	.collect(Collectors.toList());
out.println(l);

out.println(peeked);

}}



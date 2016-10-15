package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;

public class _0375 {

static String valueOf(int i) {
 return String.valueOf(i);
}

public static void main( String[] args){

List<String> peeked = new ArrayList<>();

List<String> l = IntStream.range(0,20)
	.parallel()
	.filter(i->i%3==0)
	.mapToObj(_0375::valueOf)
	.peek(s->peeked.add(s))
	.collect(Collectors.toList());
out.println(l);

out.println(peeked);

}}



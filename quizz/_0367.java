package quizz;

import static java.lang.System.out;
import java.util.stream.*;

public class _0367 {

   public static void main( String[] args){

/*one way*/
Stream.iterate(0,n->n+1)
	.map(n->n+" ")
	.limit(10)
	.parallel()
	.forEach(out::print);
out.println("");

   }
}



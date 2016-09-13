package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class ThreeRandomNumberAction implements RecursiveAction {

static AtomicInteger totalGenerated = new AtomicInteger(0);

int howMany;

ThreeRandomNumberAction(int howMany) {
this.howMany = howMany;
}

protected void compute() {
if(howMany <=3) {
for(int i=0;i<howMany;i++) {
out.println(totalGenerated.incrementAndGet() + " random int: " + new Random().nextInt(100));
}
} else {
int first = howMany/2;
int second = howMany/2 + howMany%2;
out.println("calling recursive action with " + first + " and " + second);
invokeAll(new ThreeRandomNumberAction(first),
	new ThreeRandomNumberAction(second));
}//end else
}//end compute
}//end class

public class _0426 {
public static void main(String... args) {

ForkJoinTask<?> fjt = new ThreeRandomNumberAction(20);
ForkJoinPool pool = new ForkJoinPool();
pool.invoke(fjt);

}}

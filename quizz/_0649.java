package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

class MyTask extends RecursiveTask<Integer> {

private static final int MAX = 10;
private int from;
private int to;

public MyTask(int from, int to) {
this.from=from; this.to=to;
}

protected Integer compute() {
if(to-from<=MAX) {
return IntStream.range(from,to).sum();
} else {
int middle = from + (to-from)/2;
out.println("calling MyTask("+from+","+middle+")");
MyTask first = new MyTask(from,middle);
first.fork();
out.println("calling MyTask("+middle+","+to+")");
MyTask second = new MyTask(middle,to);
return second.compute()+first.join();
}//end if-else
}//end compute

}

public class _0649 {

public static void main(String... args) {

ForkJoinPool fjp = new ForkJoinPool();
ForkJoinTask<Integer> fjt = new MyTask(0,100);
out.println(fjp.invoke(fjt));
out.println(IntStream.range(0,100).sum());
}}
 

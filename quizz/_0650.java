package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

class MyAction extends RecursiveAction {

private static final int MAX = 10;
private int from;
private int to;

public MyAction(int from, int to) {
this.from=from; this.to=to;
}

protected void compute() {
if(to-from<=MAX) {
out.println("calling MyAction("+from+","+to+")");
} else {
int middle = from + (to-from)/2;
out.println("calling MyAction("+from+","+middle+") and MyAction("+middle+","+to+")");
MyTask first = new MyTask(from,middle);
MyTask second = new MyTask(middle,to);
invokeAll(first,second);
}//end if-else
}//end compute

}

public class _0650 {

public static void main(String... args) {

ForkJoinPool fjp = new ForkJoinPool();
ForkJoinTask<?> fjt = new MyAction(0,100);
fjp.invoke(fjt);
}}
 

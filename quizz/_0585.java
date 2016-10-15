package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

/*ForkJoinPool Fwk*/

class MyAction extends RecursiveAction {

	static final int THREESHOLD = 3;

	Integer[] todo;int from;int to;

	MyAction(Integer[] todo, int from, int to) {
		this.todo=todo;this.from=from;this.to=to;
	}

	protected void compute() {
		if(to-from<=THREESHOLD) {
			for(int i=from;i<to;i++) {
			out.println(Thread.currentThread().getName() + " computes " + i);/*the computation*/
			}//end for
		} else {
			int middle = from + ((to - from) / 2);
			out.println("from: " + from + " middle: " + middle + " to:" + to);
			MyAction first = new MyAction(todo,from,middle);
			MyAction second = new MyAction(todo,middle,to);
			invokeAll(first,second);
		}
	}//end compute
}//end MyAction


public class _0585 {
public static void main(String... args) {
	Integer[] todo = new Integer[10];
	ForkJoinTask<?> ma = new MyAction(todo,0,9);
	ForkJoinPool fjp = new ForkJoinPool();
	fjp.invoke(ma);
}}


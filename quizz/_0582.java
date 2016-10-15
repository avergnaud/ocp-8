package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

/*ForkJoinPool Fwk*/

class MyAction extends RecursiveAction {

	static final int THREESHOLD = 3;

	int[] todo;int from;int to;

	MyAction(int[] todo, int from, int to) {
		this.todo=todo;this.from=from;this.to=to;
	}

	protected void compute() {
		if(to-from<THREESHOLD) {
			for(int i=from;i<=to;i++) {
			todo[i] = i;/*the computation*/
			}//end for
		} else {
			int middle = (to - from) / 2;
			MyAction first = new MyAction(todo,from,middle);
			MyAction second = new MyAction(todo,middle+1,to);
			invokeAll(first,second);
		}
	}//end compute
}//end MyAction


public class _0582 {
public static void main(String... args) {
	int[] todo = new int[100];
	MyAction ma = new MyAction(todo,0,99);
	ForkJoinPool fjp = new ForkJoinPool();
	fjp.execute(ma);
	out.println(Arrays.toString(todo));
}}


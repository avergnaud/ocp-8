package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

/*no meaning*/
class CountNumbers extends RecursiveAction {

  private int start;private int end;
  public CountNumbers(int start,int end){this.start=start;this.end=end;}

  protected void compute() {
    if(start<0) return;
    else {
      int middle = start + (end-start)/2;
      invokeAll(new CountNumbers(start,middle),new CountNumbers(middle,end));
    }
  }
}

public class _0651 {

public static void main(String... args) {

ForkJoinTask<?> task = new CountNumbers(0,4);
ForkJoinPool pool = new ForkJoinPool();
Object result = pool.invoke(task);

}}

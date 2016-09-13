package ch7.fjf;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class ThreeRandomNumberSum extends RecursiveTask<Integer> {

int howMany;

ThreeRandomNumberSum(int howMany) {
this.howMany = howMany;
}

protected Integer compute() {
if(howMany <= 3) {
Integer tmpSum = 0;
for(int i=0;i<howMany;i++) {
Integer tmp = new Random().nextInt(10);
out.println("random number to sum:" + tmp);
tmpSum += tmp;
}
return tmpSum;
} else {
int first = howMany/2;
int second = howMany/2 + howMany%2;
out.println("calling recursive task with " + first + " and " + second);
RecursiveTask<Integer> otherTask = new ThreeRandomNumberSum(first);
otherTask.fork();
return new ThreeRandomNumberSum(second).compute() + otherTask.join();
}
}

}//end class

public class F2 {
public static void main(String... args) {

ForkJoinPool fjp = new ForkJoinPool();
ForkJoinTask<Integer> fjt = new ThreeRandomNumberSum(10);
Integer res = fjp.invoke(fjt);
out.println("total: " + res);

}}

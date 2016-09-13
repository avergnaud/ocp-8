package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0420 {

static void task(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("first part of the task");
cb.await();
out.println("second part of the task");
}

public static void main( String[] args){

Callable<Boolean> c = ()->{_0420.task(null);return true;};

}}



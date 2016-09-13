package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0419 {

static void task(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("first part of the task");
cb.await();
out.println("second part of the task");
}

public static void main( String[] args){

Callable c = ()->_0419.task(null);

}}



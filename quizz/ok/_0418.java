package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0418 {

static void task(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("first part of the task");
cb.await();
out.println("second part of the task");
}

public static void main( String[] args){

Runnable r = ()->_0418.task(null);

}}



package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0417 {

static void task(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("first part of the task");
cb.await();
out.println("second part of the task");
}

public static void main( String[] args){

CyclicBarrier cb = new CyclicBarrier(3,
	()->out.println("first part is finished, let's keep going"));

ExecutorService es = null;
try {
es = Executors.newFixedThreadPool(3);
for(int i=0;i<3;i++) {
	es.execute(()->_0417.task(cb));
}
} catch(InterruptedException | BrokenBarrierException e) {
e.printStackTrace();
} finally {
if(es != null) es.shutdown();
}

}}



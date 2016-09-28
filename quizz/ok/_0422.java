package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0422 {

static boolean task(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("first part of the task");
cb.await();
out.println("second part of the task");
return true;
}

public static void main( String[] args){

CyclicBarrier cb = new CyclicBarrier(3,
	()->out.println("first part is finished, let's keep going"));

ExecutorService es = null;
try {
es = Executors.newFixedThreadPool(3);
for(int i=0;i<3;i++) {
	es.submit(()->_0422.task(cb));
}
} finally {
if(es != null) es.shutdown();
}

}}



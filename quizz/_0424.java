package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.io.*;

public class _0424 {

static String myCall(CyclicBarrier cb) throws InterruptedException, BrokenBarrierException {
out.println("firs part");
cb.await();
out.println("second part");
return "";
}

public static void main( String[] args){

CyclicBarrier cb = new CyclicBarrier(3,
	()->out.println("## first part done ##"));

ExecutorService es = null;
try {
es = Executors.newFixedThreadPool(3);
for(int i=0;i<2;i++) {
es.submit(()->_0424.myCall(cb));
}
} finally {
if(es != null) es.shutdown();
}

}}



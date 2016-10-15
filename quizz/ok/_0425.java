package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.io.*;

public class _0425 {

static String myCall() throws InterruptedException, BrokenBarrierException {
CyclicBarrier cb = new CyclicBarrier(3,
	()->out.println("## first part done ##"));
out.println("first part");
cb.await();
out.println("second part");
return "";
}

public static void main( String[] args){

ExecutorService es = null;
try {
es = Executors.newFixedThreadPool(3);
for(int i=0;i<3;i++) {
es.submit(_0425::myCall);
}
} finally {
if(es != null) es.shutdown();
}

}}



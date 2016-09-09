package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class _0370 {

static AtomicInteger count = new AtomicInteger();

static void inc() {
	String s = count.incrementAndGet() + " ";
	out.print(s);
}

   public static void main( String[] args){

ExecutorService es = Executors.newCachedThreadPool();
try {
for(int i=0;i<10;i++)
	es.execute(_0370::inc);
} finally {
es.shutdown();
}
out.println("");

   }
}



package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class _0368 {

static AtomicInteger count;

static void inc() {
	count++;
	out.println(count + " ");
}

   public static void main( String[] args){

/*another*/
ExecutorService es = Executors.newCachedThreadPool();
try {
for(int i=0;i<10;i++)
	es.execute(_0368::inc);
} finally {
es.shutdown();
}

   }
}



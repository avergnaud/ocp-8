package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class _0369 {

static AtomicInteger count;

static void inc() {
	out.println(count.incrementAndGet());
}

   public static void main( String[] args){

/*another*/
ExecutorService es = Executors.newCachedThreadPool();
try {
for(int i=0;i<10;i++)
	es.execute(_0369::inc);
} finally {
es.shutdown();
}

   }
}



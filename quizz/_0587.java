package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0587 {

static volatile int counter = 0;

static void inc() {
for(int i=0;i<1000;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException {
	
ExecutorService es = Executors.newCachedThreadPool();
try {

for(int i=0;i<10;i++) {
es.execute(_0587::inc);
}

} finally {
es.shutdown();
}

es.awaitTermination(10,TimeUnit.SECONDS);

out.println(counter);

}}


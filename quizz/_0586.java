package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0586 {

static volatile int counter = 0;

static void inc() {
for(int i=0;i<100;i++)
	counter++;
}

public static void main(String... args) throws TimeOutException {
	
ExecutorService es = Executors.newCachedThreadPool();
try {

for(int i=0;i<10;i++) {
es.execute(_0586::inc);
}

} finally {
es.shutdown();
}

es.awaitTermination(10,ChronoUnit.SECONDS);

out.println(counter);

}}


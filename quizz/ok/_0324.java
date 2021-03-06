package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class Counter {
static AtomicInteger value = new AtomicInteger();
static void increment() {
value.incrementAndGet();
}
}

public class _0324 {
public static void main(String... args) throws InterruptedException {

Runnable command = Counter::increment;
ExecutorService es = null;
try {
es = Executors.newCachedThreadPool();
for(int i=0;i<10_000;i++) {
es.execute(command);
}
} finally {
es.shutdown();
}
es.awaitTermination(2,TimeUnit.SECONDS);

out.println(Counter.value.get());

}}

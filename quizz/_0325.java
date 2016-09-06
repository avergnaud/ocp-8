package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

class Counter {
static int value;
static void increment() {
value++;
}
}

public class _0325 {
public static void main(String... args) throws InterruptedException {

Runnable command = Counter::increment;
ExecutorService es = null;
try {
es = Executors.newCachedThreadPool();
for(int i=0;i<10_000;i++) {
synchronized(_0325.class) {
es.execute(command);
}
}
} finally {
es.shutdown();
}
es.awaitTermination(2,TimeUnit.SECONDS);

out.println(Counter.value);

}}

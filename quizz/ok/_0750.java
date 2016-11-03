package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

class MyC implements Callable<String> {
  public String call() throws InterruptedException {
    Thread.sleep(1000);
    return "hello";
  }
}

public class _0750 {
public static void main(String... args) {

List<Callable<String>> tasks = Arrays.asList(new MyC(),new MyC());

List<Future<String>> results = null;
ScheduledExecutorService ses = null;
try {
  ses = Executors.newSingleThreadScheduledExecutor();
  results = ses.invokeAll(tasks,2000,TimeUnit.MILLISECONDS);
} finally {
  ses.shutdown();
}

results.forEach(future -> out.println(future.get()));

}}

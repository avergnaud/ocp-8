package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;

class MyCallable implements Callable<String> {
  public String call() throws InterruptedException {
    Thread.sleep(1000);
    return "hello";
  }
}

public class _0752 {

static void accept(Future<String> future) {
  try {
    out.println(future.get());
  } catch(InterruptedException | ExecutionException e) {
    out.println(e);
  }
}

public static void main(String... args) {

List<Callable<String>> tasks = Arrays.asList(new MyCallable(),new MyCallable());

List<Future<String>> results = null;
ScheduledExecutorService ses = null;
try {
  ses = Executors.newSingleThreadScheduledExecutor();
  results = ses.invokeAll(tasks,3000,TimeUnit.MILLISECONDS);
} catch(InterruptedException e) {
  out.println(e);
} finally {
  ses.shutdown();
}

results.forEach(_0752::accept);

}}

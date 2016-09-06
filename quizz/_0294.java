package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0294 {

static int counter;

static Integer myTask() {
return counter++;
}

public static void main(String... args) {

Set<Callable<Integer>> tasks = new HashSet<>();
for(int i=0;i<5;i++)
	tasks.add(_0294::myTask);

ExecutorService es = null;
try {
es = Executors.newSingleThreadExecutor();
List<Future<Integer>> results = es.invokeAll(tasks);
for(Future<Integer> f : results)
	out.println(f.get());
} catch (InterruptedException e) {
out.println("invokeAll interrupted");
} catch (ExecutionException e) {
out.println("ExecutionException");
} finally {
if(es != null)
	es.shutdown();
}

}}

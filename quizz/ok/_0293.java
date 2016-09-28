package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0293 {

public static void main(String... args) {

Set<Callable<String>> someSet = new HashSet<>();
someSet.add(String::new);
someSet.add(String::new);
someSet.add(String::new);

List<Future<String>> results = null;
ExecutorService service = null;
try {
service = Executors.newSingleThreadExecutor();
results = service.invokeAll(someSet);
} catch (InterruptedException e) {
out.println("invokeAll interrupted!");
} finally {
service.shutdown();
}

try {
for(Future<String> f : results) {
out.println(f.get());
}
} catch (InterruptedException e) {
out.println("get interrupted!");
} catch (ExecutionException e) {
out.println("get ExecutionException!");
}

}}

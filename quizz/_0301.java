package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0301 {

public static void main(String... args) {

ExecutorService service = null;
try {
service = Executors.newSingleThreadExecutor();

Future<?> f = service.submit(()->{Thread.sleep(2000);return null;});

Object o = f.get(1, TimeUnit.SECONDS);

} catch (InterruptedException e) {
} catch (ExecutionException e) {
} catch (TimeoutException e) {
out.println("timed out");
} finally {
service.shutdown();
}

}}

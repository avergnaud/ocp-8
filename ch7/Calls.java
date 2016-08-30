package ch7;

import java.util.concurrent.*;
import static java.lang.System.out;

public class Calls {
public static void main(String... args) {

ExecutorService es = Executors.newSingleThreadExecutor();
try {

Future<?> result = es.submit(()->{out.println("job done");});
out.println(result.get() == null);

} catch(InterruptedException | ExecutionException e) {
e.printStackTrace();
} finally {
es.shutdown();
}

}
}

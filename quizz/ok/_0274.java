package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0274 {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException, ExecutionException, TimeoutException {

ExecutorService executor = null;
try {
executor = Executors.newSingleThreadExecutor();
Future<?> future = executor.submit(_0274::inc);

future.get(10,ChronoUnit.MINUTES);

} finally {
if(executor !=null)
	executor.shutdown();
}
}

}

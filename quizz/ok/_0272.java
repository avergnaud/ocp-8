package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

//java -ea quizz._0272
public class _0272 {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException, ExecutionException {

ExecutorService executor = null;
try {
executor = Executors.newSingleThreadExecutor();
Future<?> future = executor.submit(_0272::inc);

assert future.get() == null;
} finally {
if(executor !=null)
	executor.shutdown();
}
}

}

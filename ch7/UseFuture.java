package ch7;

import static java.lang.System.out;
import java.util.concurrent.*;

public class UseFuture {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException, ExecutionException {

ExecutorService executor = null;
try {
executor = Executors.newSingleThreadExecutor();
Future<?> future = executor.submit(UseFuture::inc);

future.get();
out.println("counter > 1000");
} finally {
if(executor !=null)
	executor.shutdown();
}
}

}

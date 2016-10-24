package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0270 {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException {

ExecutorService executor = Executors.newSingleThreadExecutor();
Future<?> future = executor.submit(_0270::inc);

future.get();
out.println("counter > 1000");

}

}

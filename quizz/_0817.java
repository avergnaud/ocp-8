package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.Arrays;

public class _0817 {

public static void main(String... args) {

Callable<String> c = () -> {
		Thread.sleep(1000);
		return "hello";	
	};


ExecutorService es = Executors.newSingleThreadExecutor();
try {

String s = es.invokeAny(Arrays.asList(c),
	500,
	TimeUnit.MILLISECONDS);

out.println(s);

} catch(InterruptedException e) {
out.println(e);
} catch(ExecutionException e) {
out.println(e);
} catch(TimeoutException e) {
out.println(e);
} finally {
es.shutdown();
}

}}


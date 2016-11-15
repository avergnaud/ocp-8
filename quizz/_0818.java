package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.Arrays;

public class _0818 {

public static void main(String... args) {

Callable<String> c = () -> {
		out.println("from callable");
		Thread.sleep(1000);
		return "hello";	
	};


ExecutorService es = Executors.newSingleThreadExecutor();
Future<String> f = es.submit(c);
try {
//Thread.sleep(500);
out.println("submitted, calling f.get...");
String s = f.get(2000,TimeUnit.MILLISECONDS);

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


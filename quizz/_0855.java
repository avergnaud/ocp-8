package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _0855 {

static class Waiting implements Runnable {
	public void run() {
	try {
	Thread.sleep(10_000);
	} catch(InterruptedException e) {out.println("Waiting " + e);}
	}
}

public static void main(String... args) throws InterruptedException {

ExecutorService es = Executors.newSingleThreadExecutor();

es.submit(new Waiting());

es.awaitTermination(2,TimeUnit.SECONDS);

es.shutdownNow();

}}


package oracle.threads;

import static java.lang.System.out;
import java.util.Random;

public class SimpleThreads {

static void threadMessage(String message) {
out.format("Thread %s prints: %s%n",
	Thread.currentThread().getName(),
	message);
}

static void boringJob() {
int i = 0;
while(true) {
	try {
		out.println("boringJob " + i++);
		Thread.sleep(1000);
	} catch(InterruptedException e) {
		out.println("boringJob interrupted");
		return;
	}
}//end while
}//end boringJob

public static void main(String... args) throws InterruptedException {
int max = new Random().nextInt(10000);
out.println("Main thread will wait for " + max + "ms");

Thread t = new Thread(SimpleThreads::boringJob);
t.start();

t.join(max);
out.println("Main thread has finished waiting!");
t.interrupt();

}

}
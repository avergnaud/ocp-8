package ch7;

import static java.lang.System.out;

public class Blocking {

static void blockingJob() {
try {
Thread.sleep(10_000);// 10 sec
} catch (InterruptedException e) {
out.println("blockingJob has been interrupted");
}
}

public static void main(String... args) throws InterruptedException {

Thread t = new Thread(Blocking::blockingJob);
t.start();
t.interrupt();
t.join();
/*t.join(); will only throw InterruptedException if the thread that is doing the join-ing (here the main thread) is itself interrupted.*/
out.println("i have NOT been waiting for 10 sec");
}
}


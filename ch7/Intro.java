package ch7;

import static java.lang.System.out;

class Counter {
static int value = 0;
static synchronized void megaInc() {
for(int i=0;i<100_000;i++)
	{value++;}
out.println(Thread.currentThread().getName() + " finished : " + value);
}
}

public class Intro {
public static void main(String... args) throws InterruptedException {

Runnable r = Counter::megaInc;

Thread t1 = new Thread(r,"t1");
t1.setPriority(Thread.MAX_PRIORITY);
Thread t2 = new Thread(r,"t2");
t2.setPriority(Thread.NORM_PRIORITY);
Thread t3 = new Thread(r,"t3");
t3.setPriority(Thread.MIN_PRIORITY);

t1.start();
t2.start();
t3.start();
t1.join();
t2.join();
t3.join();
out.println(Counter.value);

}}

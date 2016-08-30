package oracle.threads;

import static java.lang.System.out;

class SomeTask implements Runnable {
public void run() {
out.println("some task");
}
}

class SomeThread extends Thread {
public void run() {
out.println("some thread");
}
}

public class Tuto {

public static void main(String... args) {

Thread t1 = new Thread(new SomeTask());
t1.start();

Thread t2 = new SomeThread();
t2.start();

}

}
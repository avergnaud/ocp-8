package oracle.threads;

import static java.lang.System.out;

public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void blockingComputation() {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            out.println(i + ": " + fibonacci(i));
	    if(Thread.interrupted()) {
		out.println("interrupted");
	    	return;
	    }
	}
    }

public static void main(String[] args) throws InterruptedException {
Thread t = new Thread(Fibonacci::blockingComputation);
t.start();
Thread.sleep(5000);//wait for 3 secs
t.interrupt();//stops computation
}

}
package quizz;

import static java.lang.System.out;

public class _0862 extends Thread {

private static int threadcounter = 0;

public synchronized void run() {
	threadcounter++;
	out.println(threadcounter);
}

public static void main(String... args)  {

for(int i=0; i<5; i++) {
	new _0862().start();
}
out.println(threadcounter + " DONE");

}}


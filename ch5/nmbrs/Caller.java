package ch5.nmbrs;

import static java.lang.System.out;

public class Caller {
public static void main(String... args) {


Thread t1 = new Thread(new Runnable() {
	public void run() {
		for(int i=0;i<1000;i++) {
			String s = NotThreadSafe.NF.format(1.1);
			out.println("t1" + s);
		}
	}
});

Thread t2 = new Thread(new Runnable() {
	public void run() {
		for(int i=0;i<1000;i++) {
			String s = NotThreadSafe.NF.format(1.2);
			out.println("t2" + s);
		}
	}
});

Thread t3 = new Thread(new Runnable() {
	public void run() {
		for(int i=0;i<1000;i++) {
			String s = NotThreadSafe.NF.format(1.3);
			out.println("t3" + s);
		}
	}
});

t1.run();
t2.run();
t3.run();


}}

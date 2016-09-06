package ch7;

import static java.lang.System.out;

public class Bad2 {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) throws InterruptedException {

Thread t = new Thread(Bad2::inc);
t.start();

while(counter<1_000) {
out.println("counter: " + counter + ". sleeping for 500");
Thread.sleep(500);
}
out.println("counter > 1000");

}

}

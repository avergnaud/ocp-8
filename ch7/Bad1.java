package ch7;

import static java.lang.System.out;

public class Bad1 {

static int counter = 0;

static void inc() {
for(int i=0;i<1001;i++)
	counter++;
}

public static void main(String... args) {

Thread t = new Thread(Bad1::inc);
t.start();

while(counter<1_000) {
}
out.println("counter > 1000");

}

}

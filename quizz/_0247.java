package quizz;

import static java.lang.System.out;

class MyT extends Thread {
String name;
MyT(String name) {
	this.name=name;	
}
public void run() {
	for(int i=0;i<3;i++)
		out.println(name + " " + i);
}
}

public class _0247 {

public static void main(String... args) {

Thread t1 = new MyT("t1");
Thread t2 = new MyT("t2");
Thread t3 = new MyT("t3");

t1.run();t2.run();t3.run();

}
}


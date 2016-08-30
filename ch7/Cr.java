package ch7;

import static java.lang.System.out;

public class Cr {
public static void main(String... args) {

Thread t1 = new Thread(new Runnable(){
public void run() {
out.println("hi from t1");
}
});

Thread t2 = new Thread(()->out.println("hi from t2"));

t1.start();
t2.start();

}
}

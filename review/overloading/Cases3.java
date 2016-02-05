package review.overloading;

public class Cases3 {
public static void main(String... args) {
	myMethod(1);
}
static void myMethod(Number n) {
	System.out.println("Number n");
}
static void myMethod(int... i) {
	System.out.println("int...");
}
}
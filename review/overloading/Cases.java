package review.overloading;

public class Cases {
public static void main(String... args) {
	//exact match beats everything
	myMethod(Integer.valueOf(1));
}
static void myMethod(Integer i) {
	System.out.println("Integer i");
}
static void myMethod(Number n) {
	System.out.println("Number n");
}
}
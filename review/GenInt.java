package review;

public class GenInt {

static <X extends CharSequence> X get() {
	return (X)"toto";//unchecked or unsafe operation
}

public static void main(String[] args) {
	System.out.println(GenInt.<StringBuilder>get());
}}
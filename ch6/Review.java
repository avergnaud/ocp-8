package ch6;

import static java.lang.System.out;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Review {
public static void main(String... args) {

try {
	int i = 5/0;
} catch (ArithmeticException e) {
	out.println("ArithmeticException -runtime - thrown by JVM");
}

try {
	get().toString();
} catch (NullPointerException e) {
	out.println("NullPointerException -runtime - thrown by JVM");
}

try {
	FileInputStream fis = new FileInputStream("n'existe pas");
} catch(FileNotFoundException e) {
	out.println("FileNotFoundException -checked - thrown by JVM");
}

try {
	some();
} catch (IllegalArgumentException e) {
	out.println("IllegalArgumentException -runtime - thrown by program");
}

try {
Number first = new Double(1.0);
Integer i = (Integer) first;
} catch (ClassCastException e) {
	out.println("ClassCastException -runtime - thrown by JVM");
}

try {
String not = args[100];
} catch (ArrayIndexOutOfBoundsException e) {
	out.println("ArrayIndexOutOfBoundException -runtime - thrown by JVM");
}

try {
Double d = new Double("toto");
} catch (NumberFormatException e) {
	out.println("NumberFormatException -runtime - thrown by program");
}

}

static Object get() {
	return null;
}

static void some() {
	throw new IllegalArgumentException();
}
}

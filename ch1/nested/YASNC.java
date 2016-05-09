package ch1.nested;

public class YASNC {

static int var = Nested.y;

static class Nested {
	static int y = var;
}

public static void main(String... args) {
System.out.println(var);
}

}
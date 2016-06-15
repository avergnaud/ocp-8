package ch4.gen;

class Def<T> {
static <T> Def<T> of(T t) {
	return null;
}
}

public class Mine {
public static void main(String... args) {
Def<Integer> def = new Def<>();
Def<String> test = def.<String>of("toto");
}
}

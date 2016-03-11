package ch1.annotation;

class Parent {
	static void methode() {}
}

public class Over extends Parent {
	@Override
	static void methode() {}
}
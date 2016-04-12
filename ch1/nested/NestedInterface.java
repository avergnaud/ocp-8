package ch1.nested;

class NestedInterface {

int i;

class A {
void test() {int j = i;}
}

interface B {
//default void test() {int j = i;}

	/*private*/ interface C {}

}

}
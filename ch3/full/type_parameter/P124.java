package ch3.full.type_parameter;

import java.util.*;

class A {}

class B {}

public class P124 {

<T extends A> void method(T t) {}

<T> void method2(List<? super A> liste) {}

//<T super A> void method3(T t){}

<T extends A> void method4() {}

//<? extends A> void method5() {}

<X extends B> void method6(List<X> list) {}

}
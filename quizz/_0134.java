package quizz;


interface MyI1 {
default void first() {}
}
interface MyI2 {
default void first() {}
}

class C implements MyI1, MyI2 {
public void first() {MyI2.super.first();}
}

public class _0134 {
public static void main(String... args) {


}}

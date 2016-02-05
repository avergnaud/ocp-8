package review.hiding;

public class StaticMethodHiding {
public static void main(String... args) {
Parent enfant = new Enfant();
enfant.print();
}
}

class Parent {
static void print() {System.out.println("parent");}
}

class Enfant extends Parent {
static void print() {System.out.println("enfant");}
}
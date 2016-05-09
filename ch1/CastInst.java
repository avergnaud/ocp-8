package ch1;

interface Mixin {}

class Parent{}

/*final*/ class Enfant extends Parent {}

class UneAutre implements Mixin {}

public class CastInst {
public static void main(String... args) {

Enfant enfant = new Enfant();
System.out.println("enfant instanceof Mixin : "
	+ (enfant instanceof Mixin));
try {
Mixin maVar = (Mixin)enfant;
} catch(ClassCastException e) {
System.out.println("Mixin maVar = (Mixin)enfant : "
	+ e.getMessage());
}

}
}
package ch1.nested;

class Outer {
interface Some {}
class But {}
}

public class Implicit {
public static void main(String... args) {
Outer.Some myInt = new Outer.Some(){};

/* Outer.But myC = new Outer.But();

ch1\nested\Implicit.java:12: error: an enclosing instance that contains
 Outer.But is required
Outer.Some myC = new Outer.But();

*/

Outer.But myC = new Outer().new But();

}
}
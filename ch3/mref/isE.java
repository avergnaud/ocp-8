package ch3.mref;

import java.util.*;
import java.util.function.*;

public class isE {
public static void main(String... args) {
Predicate<String> myP = s -> s.startsWith("A");

String str = "Test";
Predicate<String> another = str::startsWith;

/*can i use method reference on an instance
to be determined at runtime? no
only for no-parameter method references?*/
Predicate<String> essai = String::isEmpty;

/* Supplier<Boolean> essai2 = String::isEmpty;
only for no-parameter method references
AND one parameter functionnal interface*/

}
}
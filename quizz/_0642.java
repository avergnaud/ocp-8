package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0642 {

public static void main(String... args) {

Predicate<? super String> p = new Predicate<Object>(){
	public boolean test(Object o) {
		return o != null;
	}
};

out.println(p.test("hello"));

/*out.println(p.test(new Object())); 
incompatible types: Object cannot be converted to CAP#1*/

}}
 

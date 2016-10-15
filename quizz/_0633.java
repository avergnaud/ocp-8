package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0633 {

static boolean myPred(Object o) {
return o != null;
}

public static void main(String... args) {

Predicate<? super String> p = _0633::myPred;
out.println(p.test("123"));

out.println(p.test(new Object()));

}}


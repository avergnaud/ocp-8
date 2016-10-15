package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0632 {

public static void main(String... args) {

Predicate<? super String> p = (s) -> s.length() > 1;
out.println(p.test("123"));

out.println(p.test(new Object()));

}}


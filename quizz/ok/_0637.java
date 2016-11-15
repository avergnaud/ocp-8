package quizz;

import static java.lang.System.out;
import java.util.function.*;

public class _0637 {

public static void main(String... args) {

Function<String,String> f = String::new;

out.println(f.apply("hello"));

}}


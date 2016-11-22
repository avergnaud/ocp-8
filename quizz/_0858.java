package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0858 {

public static void main(String... args)  {

Optional<String> os = Optional.of("10");
Optional<Integer> oi = os.map(s -> Integer.decode(s)); 

out.println(oi);

}}


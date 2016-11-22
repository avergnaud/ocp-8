package quizz;

import static java.lang.System.out;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class _0364 {

public static void main(String... args) {
/*https://bugs.openjdk.java.net/browse/JDK-8140281*/

Optional<String> o = Optional.empty();
String s = o.get();
out.println(s);

}}



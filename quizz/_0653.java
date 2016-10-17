package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class _0653 {

public static void main(String... args) {

List<String> l1 = Arrays.asList("leopard","lynx","ocelot","puma");
List<String> l2 = Arrays.asList("panda","grizzly","polar");

/*collect two groups: those starting with p and the others*/

Map<Boolean,List<String>> m = Stream.of(l1,l2)
  .flatMap(liste->liste.stream())
  .collect(
    Collectors.partitioningBy(string->string.startsWith("p"))
  );

out.println(m);

}}

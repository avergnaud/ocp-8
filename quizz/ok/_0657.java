package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class _0657 {

public static void main(String... args) {

Stream<String> l1 = Stream.of("leopard","lynx","ocelot","puma");
Stream<String> l2 = Stream.of("panda","grizzly","polar");

/*collect two groups: those starting with p and the others*/

Map<Boolean,Set<String>> m = Stream.of(l1,l2)
  .flatMap(stream->stream)
  .collect(
    Collectors.partitioningBy(string->string.startsWith("p"),
      Collectors.toCollection(TreeSet::new))
  );

out.println(m);

}}

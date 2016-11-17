package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0829 {

public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,"trois");
map.put(4,"quatre");

map.compute(5,(k,v)->v);
out.println(map);

map.computeIfPresent(5,(k,v)->v);
out.println(map);

map.compute(5,(k,v)->"five");
out.println(map);

map.computeIfPresent(6,(k,v)->"six");
out.println(map);

/* either create or append a String msg to a value mapping: */
map.compute(6,(k,v)->(v==null)?"six":v+"_appended");
map.compute(6,(k,v)->(v==null)?"six":v+"_appended");
out.println(map);

}}


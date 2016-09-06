package quizz;

import static java.lang.System.out;
import java.util.*;
import static java.util.Map.Entry;

public class _0329 {
public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,"trois");


Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator();
while(iterator.hasNext()) {
	iterator.remove();
}

out.println(map);

}}

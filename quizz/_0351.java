package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0351 {
public static void main(String... args) throws InterruptedException {

Map<Integer,String> map = new HashMap<>();
map.put(1,"one");
map.put(2,"two");
Map<Integer,String> syncMap = Collections.synchronizedMap(map);
for(Integer key : syncMap.keySet()) {
	syncMap.remove(key);
}
out.println(syncMap);

}}

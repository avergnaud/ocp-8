package quizz;

import static java.lang.System.out;
import java.util.*;
import static java.util.Map.Entry;

public class _0330 {
public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,"trois");


Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator();
while(iterator.hasNext()) {
	iterator.next();
	iterator.remove();
}

out.println(map);

}}
//https://coderanch.com/t/603302/threads/java/Concurrent-modification-exception-case-remove
/*
avec :

for(Integer i : map.keySet())
	map.remove(i);

l'iterator créé par keySet() n'est pas is à jour lorsqu'un objet est supprimé...

*/

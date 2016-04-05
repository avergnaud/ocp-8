package ch3;

import java.util.*;
import java.util.function.*;

public class MapRev {
public static void main(String... args) {

Map<String,Integer> map = new HashMap<>();
map.put("Un",1);
map.put("Deux",null);
//System.out.println(map);

/*public V putIfAbsent(K,V)*/
map.putIfAbsent("Un",101);
map.putIfAbsent("Deux",2);
//System.out.println(map);

/*public V merge(K,V,BiFunction<? super V,? super V,? extends V>)*/
map.put("Trois",3);
//System.out.println(map);

map.merge("Quatre",4,(a,b)->a+b);
//System.out.println(map);

map.merge("Quatre",4,(a,b)->a+b);
//System.out.println(map);

try {
map.merge("Quatre",null,(a,b)->a+b);
} catch(NullPointerException e) {
//System.out.println("NPE");
}
//System.out.println(map);

map.merge("Quatre",4, (a,b)->null);
//System.out.println(map);

/*public V compute(K,BiFunction<? super K,? super V,? extends V>)*/
map.compute("Trois",(k,v)->v==null?42:v+2);
System.out.println(map);

/*public V computeIfPresent(K,BiFunction<? super K,? super V,? extends V>)*/
map.computeIfPresent("Trois",(k,v)->v+1);
System.out.println(map);

/*public V computeIfAbsent(K,Function<? super K,?extends V>)*/
map.computeIfAbsent("Quatre",k->4);
System.out.println(map);

}
}

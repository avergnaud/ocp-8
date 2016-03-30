package ch3;
import java.util.*;
import java.util.function.BiFunction;

public class MapMergeCases {
public static void main(String... args) {

Map<Integer,String> map = new HashMap<>();
map.put(1,"un");
map.put(2,"deux");
map.put(3,null);
map.put(4,"quatre");
System.out.println(map);

BiFunction<String,String,String> remappingFunction = (s1,s2) -> s1+s2;

map.merge(1,"_one",remappingFunction);

map.merge(3,"trois",remappingFunction);

remappingFunction = (s1,s2) -> null;

map.merge(4,"_four",remappingFunction);

System.out.println(map);

}
}
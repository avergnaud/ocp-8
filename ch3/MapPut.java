package ch3;

import java.util.*;

public class MapPut {
public static void main(String... args) {
Map<String,String> favs = new HashMap<>();
favs.put("adrien","velo");
favs.put("steph",null);
System.out.println(favs);

favs.putIfAbsent("steph","bus");
System.out.println(favs);
}
}
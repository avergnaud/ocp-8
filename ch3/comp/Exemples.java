package ch3.comp;

import java.util.*;

public class Exemples {
public static void main(String... args) {
Comparator<Integer> reverse = (i,j)-> j.compareTo(i);
List<Integer> liste = Arrays.asList(1,2,3,4);
Collections.sort(liste, reverse);
System.out.println(liste);
}
}
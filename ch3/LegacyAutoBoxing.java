package ch3;

import java.util.*;

class LegacyAutoBoxing {
public static void main(String[] args) {
List numbers = new ArrayList();
numbers.add(15);
int i = numbers.get(0);
System.out.println(i);
}
}
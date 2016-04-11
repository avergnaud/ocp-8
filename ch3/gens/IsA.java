package ch3.gens;

import java.util.*;

public class IsA {

public static void main(String[] args) {

//List rawIntegers = Arrays.asList(new Integer(1));
List rawIntegers = new ArrayList();
rawIntegers.add(new Integer(1));
List rawObjects = rawIntegers;
rawObjects.set(0,"hello");
System.out.println(rawIntegers.get(0));

Integer[] integersArray = {new Integer(2)};
Object[] objectsArray = integersArray;
//objectsArray[0] = "hello";java.lang.ArrayStoreException: java.lang.String

List<Integer> integers = new ArrayList<>();
integers.add(new Integer(3));
List rawObjects2 = integers;
rawObjects2.set(0,"hello");
System.out.println(integers.get(0));

}


}
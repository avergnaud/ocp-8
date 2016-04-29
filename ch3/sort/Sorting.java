package ch3.sort;

import java.util.*;

public class Sorting {
public static void main(String... args) {
Integer[] numbers = {5,4,3,7,1};

Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));

int index = Arrays.binarySearch(numbers,5);
System.out.println("numbers["+index+"]=5");

Arrays.sort(numbers, new Reverse());
System.out.println(Arrays.toString(numbers));

index = Arrays.binarySearch(numbers,5,new Reverse());
System.out.println("numbers["+index+"]=5");

TreeSet<Rabbit> test = new TreeSet<>();
//test.add(new Rabbit()); java.lang.ClassCastException

List<Rabbit> test2 = new ArrayList<Rabbit>();
test2.add(new Rabbit());
//Collections.sort(test2); javac fail !

TreeSet<Rabbit> test3 = new TreeSet<>((r1,r2) -> r1.id - r2.id);

}
}

class Reverse implements Comparator<Integer> {
public int compare(Integer i1, Integer i2) {
return i2.compareTo(i1);
}
}

class Rabbit {int id;}
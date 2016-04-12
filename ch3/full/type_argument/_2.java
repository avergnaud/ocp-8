package ch3.full.type_argument;

import java.io.*;
import java.util.*;

/*Type arguments may be either reference types or wildcards. Wildcards are useful in situations where only partial knowledge about the type parameter is required.*/

/*
http://stackoverflow.com/questions/3486689/java-bounded-wildcards-or-bounded-type-parameter
http://stackoverflow.com/questions/4902723/why-cant-a-java-type-parameter-have-a-lower-bound
*/

class _2 {
public static void main(String[] args) {

List<String> first = new ArrayList<>();

List<? extends Number> second = new ArrayList<Integer>();
// second.add(new Integer(1));ko

List<? super IOException> third = new ArrayList<Exception>();
third.add(new FileNotFoundException());
//third.add(new Exception());

List<?> fourth = new ArrayList<String>();
//fourth = new ArrayList<?>(); required : class or interface without bounds
}
}

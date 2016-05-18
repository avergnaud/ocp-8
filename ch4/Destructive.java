package ch4;

import java.util.stream.*;
import static java.lang.System.out;


public class Destructive {
public static void main(String... args) {

Stream<Integer> st = Stream.of(1,2,3,4);
out.println(st.count());
out.println(st.count());

}}

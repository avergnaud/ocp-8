package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0602 {

public static void main(String... args) {

List<String> l1 = new Vector<>();
l1.add(null);out.println("Vector allow nulls");
List<String> l2 = new ArrayList<>();
l2.add(null);out.println("ArrayList allow nulls");
List<String> l3 = new CopyOnWriteArrayList<>();
l3.add(null);out.println("CopyOnWriteArrayList allow nulls");

}}


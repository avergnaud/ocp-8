package ch4;

import java.util.stream.*;
import java.util.function.*;
import static java.lang.System.out;

public class MatchAnims {
public static void main(String... args) {

Stream<String> animals = Stream.of("dog","4chan","cat");

//checks whether animal names begin with letters

/*
boolean anyMatch(Predicate<T> pred)
boolean allMatch(Predicate<T> pred)
boolean noneMatch(Predicate<T> pred)
*/

Predicate<String> pred = s -> Character.isLetter(s.charAt(0));

Stream<String> inf = Stream.generate(()->"elephant");

boolean one = animals.anyMatch(pred);
out.println(one);

/*
boolean two = animals.allMatch(pred);

true
Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed


boolean everlasting = inf.allMatch(pred);
out.println(everlasting);
*/

}}
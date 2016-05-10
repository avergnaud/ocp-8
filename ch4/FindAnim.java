package ch4;

import java.util.stream.*;
import java.util.Optional;

public class FindAnim {
public static void main(String... args) {

//Stream<String> animals = Stream.of("elephant","snake","cat","dog");
Stream<String> animals = Stream.of("elephant","dog","snake","cat");

Optional<String> mini = animals.min((s1,s2)->s1.length() - s2.length());

mini.ifPresent(System.out::println);


//find any animal from empty stream
Stream<String> emptyOne = Stream.empty();
Optional<String> res = emptyOne.findAny();
System.out.println(res.isPresent());

//find any animal from finite stream
Stream<String> another = Stream.of("dog","cat","thing");
res = another.findAny();
res.ifPresent(System.out::println);

//find any animal from infinite stream
Stream<String> last = Stream.generate(()->"DOG");
res = last.findAny();//Not a reduction but a terminal operation
res.ifPresent(System.out::println);

}}
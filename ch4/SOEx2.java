package ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SOEx2 {
public static void main(String... args) {

List<Long> sourceLongList = Arrays.asList(1L, 10L, 50L, 80L, 100L, 120L, 133L, 333L);
List<Long> targetLongList = sourceLongList
	.stream()
	.filter(l -> l > 100)
	.collect(Collectors.toList());

System.out.println(targetLongList);

}}

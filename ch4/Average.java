package ch4;

import java.util.*;
import java.util.stream.*;

public class Average {
public static void main(String... args) {



}

public static Optional<Double> average1(int... score) {
	if(score.length == 0) {
		return Optional.empty();
	}
	int total = 0;
	for(int i : score) {
		total += i;
	}
	int moyenne = total/score.length;
	return Optional.of((double)moyenne);
}

public static OptionalDouble average2(int... score) {
	IntStream s = Arrays.stream(score);
	return s.average();
}

}
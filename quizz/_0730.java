package quizz;

import static java.lang.System.out;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

/* a comparator for int[] ? */
public class _0730 {

public static void main(String... args) {

int[] firstArray = {1,2,3,4,5};
int[] secondArray = {4,5,6};

Stream.of(firstArray,secondArray)
  .sorted(Comparator.comparing(array->array.length))
  .forEach(array -> out.println(Arrays.toString(array)));

}}

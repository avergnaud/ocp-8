package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0037 {

public static void main(String... args) {

Integer[] someIntegers = new Integer[]{4,5,6};

Object[] os = someIntegers;

os[2] = new Integer(7);
out.println(Arrays.toString(os));

}

}

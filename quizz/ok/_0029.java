package quizz;

import static java.lang.System.out;
import java.util.Arrays;

public class _0029 {

public static void main(String... args) {

String[] someL = {"a","A","1","2","toto","toto_"};
Arrays.sort(someL);
int res = Arrays.binarySearch(someL,"2");
out.println(res);


}

}

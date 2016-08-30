package quizz;

import static java.lang.System.out;

/*execute with following line:
java -ea quizz._0241
*/
public class _0241 {
public static void main(String... args) {

assert 1 < 5 : "1>5"; 
assert(2 < 5) : "2>5"; 

assert (test()) : "some";

}//end main

static boolean test() {return true;}

}



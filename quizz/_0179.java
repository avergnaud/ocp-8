package quizz;

import static java.lang.System.out;
import java.util.*;

/*
root
 +properties_folder
 +quizz
  +_0179.java

javac quizz/_0179.java
java -cp properties_folder:. quizz._0179
*/
public class _0179 {

public static void main(String... args) {

Locale frFR = new Locale("fr","FR");

ResourceBundle frFRRB = ResourceBundle.getBundle("AGAIN",frFR);

out.println(frFRRB.keySet());

}

}



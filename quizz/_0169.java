package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0169 {

public static void main(String... args) {

Locale englishGB = new Locale("en","GB");
ResourceBundle enGBRB = ResourceBundle.getBundle("LECTURE",englishGB);
enGBRB.getKeys().stream().forEach(System.out::println);

}

}



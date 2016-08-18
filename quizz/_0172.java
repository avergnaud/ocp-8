package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0172 {

public static void main(String... args) {

Locale englishGB = new Locale("en","GB");
ResourceBundle enGBRB = ResourceBundle.getBundle("LECTURE",englishGB);
out.println(enGBRB.get("cle1"));//assume cle1 in file

}

}



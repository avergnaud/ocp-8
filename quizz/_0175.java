package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0175 {

public static void main(String... args) {

Locale frFR = new Locale("fr","FR");
/*
!lol
#cle1 valeur1
cle1 valeur1 \
OKTAM
cl2 valeur2
*/
ResourceBundle frFRRB = ResourceBundle.getBundle("LECTURE",frFR);

frFRRB.keySet()
	.stream()
	.map(k -> k + " : " + frFRRB.getString(k))
	.forEach(out::println);

}

}



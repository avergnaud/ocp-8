package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.function.stream.*;

public class _0176 {

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

Map<String,String> mm = frFRRB.keySet()
	.stream()
	.collect(
		Collectors.toMap(
			k->k,
			k->frFRRB.getString(k)));
out.println(mm);
}

}



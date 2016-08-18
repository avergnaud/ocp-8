package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0177 {

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

Properties p = new Properties();

frFRRB.keySet().forEach(p.put(k,frFRRB.getString(k)));

out.println(p);

}

}



package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0174 {

public static void main(String... args) {

Locale frFR = new Locale("fr","FR");
/*
!lol
#cle1 valeur1
cle1 valeur1 \
OKTAM
*/
ResourceBundle frFRRB = ResourceBundle.getBundle("LECTURE",frFR);
out.println(frFRRB.getString("cle1"));

}

}



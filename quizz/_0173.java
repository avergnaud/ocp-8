package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0173 {

public static void main(String... args) {

Locale englishUS = new Locale("en","US");
/*
!lol
#cle1 valeur1
cle1    valeur1 
*/
ResourceBundle enUSRB = ResourceBundle.getBundle("LECTURE",englishUS);
out.println(enUSRB.getString("cle1") + "lol");/*"cle1    valeur1 "*/

}

}



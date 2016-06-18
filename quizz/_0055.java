package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0055 {

public static void main(String... args) {

List<String> liste = Arrays.asList("u_n","deu_x","tro_is");
liste.replaceAll(s -> s.replace("_",""));
out.println(liste);
}
}

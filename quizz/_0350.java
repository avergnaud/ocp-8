package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0350 {
public static void main(String... args) throws InterruptedException {

List<String> liste = new CopyOnWriteArrayList<>();
liste.add("zero");
liste.add("un");
liste.add("deux");
int i=0;
for(String s : liste) {
out.println(s);
liste.add("and " + ++i);
}
out.println(liste);

}}

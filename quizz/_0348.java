package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0348 {
public static void main(String... args) throws InterruptedException {

List<String> liste = new ArrayList<>();
liste.add("zero");
liste.add("un");
liste.add("deux");
for(int i=0;i<liste.size();i++) {
out.println(liste.get(i));
liste.add("and " + i);
}

}}

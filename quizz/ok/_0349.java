package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0349 {
public static void main(String... args) throws InterruptedException {

List<String> liste = new ArrayList<>();
liste.add("zero");
liste.add("un");
liste.add("deux");
int i=0;
for(String s : liste) {
out.println(s);
liste.add("and " + ++i);
}

}}

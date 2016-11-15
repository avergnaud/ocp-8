package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class _0814 {

static class Lizard implements Comparator<Lizard> {
int weight;
Lizard(int w) {weight = w;}
public int compare(Lizard l, Lizard m) {
return l.weight - m.weight;
}
}

public static void main(String... args) {

List<Lizard> list = new ArrayList<>();
list.add(new Lizard(5));
list.add(new Lizard(10));

Collections.sort(list);
out.println(list);

}}


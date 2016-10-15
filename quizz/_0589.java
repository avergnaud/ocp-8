package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0589 {

static <E extends CharSequence> List<? super E> methode(List<E> liste) {
return liste;
}

public static void main(String... args) throws InterruptedException {

List<String> ml = new ArrayList<>();
List<? super String> r = methode(ml);	

}}


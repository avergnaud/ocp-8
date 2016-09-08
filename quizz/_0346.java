package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.concurrent.*;

public class _0346 {
public static void main(String... args) throws InterruptedException {

NavigableSet<String> csls = new ConcurrentSkipListSet<>();
csls.add("12");
csls.add("b");
csls.add("a");
csls.add("A");
out.println(csls.floor("a"));
out.println(csls.lower("a"));

}}

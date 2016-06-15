package misc;

import java.util.*;
import static java.lang.System.out;

public class Nav {
public static void main(String... args) {

TreeSet<String> some = new TreeSet<>();
some.add("D");
some.add("d");
some.add("1");
some.add("_");
some.add("12");
some.add("D_");

out.println(some);
out.println(some.floor("abc"));
out.println(some.floor("_"));

}
}
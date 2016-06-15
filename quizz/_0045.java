package quizz;

import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class _0045 {

public static void main(String... args) {

List<String> liste = Arrays.asList("1","2","3");

Iterator it = liste.iterator();

while(it.hasNext()) {
	String t = it.next();
	out.println(t);
}

}
}

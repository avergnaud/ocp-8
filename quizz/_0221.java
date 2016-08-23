package quizz;

import static java.lang.System.out;
import java.util.*;

public class _0221 {

public static void main(String... args) {

try {
ResourceBundle rb = ResourceBundle.getBundle("does not exist");
} catch(ResourceBundleException e) {
out.println("resource does not exist");
}

}//end main
}



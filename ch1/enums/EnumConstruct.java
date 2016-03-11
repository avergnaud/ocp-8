package ch1.enums;
import static java.lang.System.*;
import java.util.*;

/*enum Color {
        RED, GREEN, BLUE;
        static final Map<String,Color> colorMap = 
        new HashMap<String,Color>();
        Color() {
            colorMap.put(toString(), this);
        }
}*/

enum Single {

	ONCE;

	private Single() {
		Counter.value++;
		out.println(Counter.value);
	}


private static class Counter {
	private static int value = 0;
}

}

public class EnumConstruct {
public static void main(String... args) {
out.println(Single.ONCE);
out.println(Single.ONCE);
}
}


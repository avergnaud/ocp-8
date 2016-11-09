package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;

public class _1300 {

interface Mine {
	void methodX();
}

public static void main(String... args) {

//Thread.sleep(1000);

Callable<?> c = ()->{Thread.sleep(1000);return null;};

Callable<?> c2 = ()->{throw new Exception();};

Mine m = ()->{throw new Exception();};

}}

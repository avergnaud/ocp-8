package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0103 {
public static void main(String... args) {

	LocalDateTime ldt = LocalDateTime.now().plus(Duration.of(1,ChronoUnit.WEEKS));
	out.println(ldt);
}
}
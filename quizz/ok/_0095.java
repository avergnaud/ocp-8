package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.*;

public class _0095 {
public static void main(String... args) {

Period p = Period.of(0,0,35);
out.println(p);

Duration d = Duration.of(65,ChronoUnit.MINUTES);
out.println(d);

}
}
package quizz;

import static java.lang.System.out;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class _0083 {

public static void main(String... args) {

/*
ASSUME correct code
*/
out.println(aucklandZDT);/*2016-06-21T00:31:36.396+12:00[Pacific/Auckland]*/

/*
ASSUME correct code
*/
out.println(saoPauloZDT);/*2016-06-20T15:31:36.427-03:00[America/Sao_Paulo]*/

out.println(aucklandZDT.until(saoPauloZDT,ChronoUnit.HOURS));

//SaoPaulo time is X hours behind Auckland time

}
}
























































//6
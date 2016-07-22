package misc;

import java.time.*;
import static java.lang.System.out;

public class MaxNanos {
public static void main(String... args) {

out.println(Integer.MAX_VALUE);

out.println(LocalTime.of(12,0,0,0));
out.println(LocalTime.of(12,0,0,Integer.MAX_VALUE));
//  999_999_999
//2_147_483_647
}}

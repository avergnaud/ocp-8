package quizz;

import static java.lang.System.out;

interface I1 {
int i = 1;
}

interface I2 extends I1 {
int i = 2;
}

public class _0863 implements I1,I2 {

public static void main(String... args)  {
out.println(i);
}}


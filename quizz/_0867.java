package quizz;

import static java.lang.System.out;

interface I1 {
default int get() {return 1;}
}


interface I2 extends I1 {
default int get() {return 2;}
}

public class _0867 implements I1,I2 {

public static void main(String... args)  {

}}


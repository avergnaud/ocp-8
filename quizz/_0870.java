package quizz;

import static java.lang.System.out;

public class _0870 {

static class SNC {}

class NC {}

static void print() {out.println("but this is ok");}

public static void main(String... args)  {

SNC s = new SNC();
SNC s2 = new _0870.SNC();
NC s3 = new _0870().new NC();

//SNC s4 = new _0870().new SNC();
new _0870().print();

}}


package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

/* "execute 10 Runnable series" */
public class _0663 {

static void myRun() {
  out.println("hello");
}

public static void main(String... args) {

Stream.generate(()->"").limit(10)
  .forEach(string->_0663.myRun());/*not a call to a runnable*/

}}

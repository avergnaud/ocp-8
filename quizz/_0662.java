package quizz;

import static java.lang.System.out;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

/* "execute 10 Runnable series" */
public class _0662 {


static void myRun() {
  out.println("hello");
}

public static void main(String... args) {

Stream.generate(()->"").limit(10)
  .forEach(_0662::myRun);

}}

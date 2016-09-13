package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.io.*;

public class _0423 {

static void suitableRunMethod() throws IOException {

}

static String suitableCallMethod() throws IOException {

return "";
}

public static void main( String[] args){

ExecutorService es = null;
try {
es = Executors.newCachedThreadPool();
es.submit(_0423::suitableRunMethod);
} finally {
if(es != null) es.shutdown();
}

}}



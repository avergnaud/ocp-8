package quizz;

import static java.lang.System.out;
import java.util.concurrent.*;
import java.util.*;


public class _0601 {

class Some {
void print() {}
}

String m2 = "m2";

void maMethode() {
	String m1 = "m1";
	new Some(){
		void print() {
			out.println(m1);
			out.println(m2);
		}
	}.print();
}

public static void main(String... args) {

	new _0601().maMethode();

}}


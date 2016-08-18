package ch1.nested2;

import static java.lang.System.*;

public class AllOfThem {

class MemberInner {

}

static class StaticNested {

}

static void myMeth() {

	int i = 1;//effectively final

	class LocalInner {
		void test() {
		out.println(i);
		}
	}

}

public static void main(String... args) {

MemberInner mi = new AllOfThem().new MemberInner();

StaticNested sn = new StaticNested();

}

}


class Another {

static void test() {
AllOfThem.MemberInner mi = new AllOfThem().new MemberInner();
AllOfThem.StaticNested sn = new AllOfThem.StaticNested();
}

}

package misc.builders;

import static java.lang.System.out;
import java.util.*;

class Some {
	String prop;
	Some(String s) {
		prop = s;
	}
	public String toString() {
		return "Some_" + prop;	
	}

	static class Builder {
		String prop;
		Builder setProp(String s) {
			prop = s;
			return this;
		}
		Some build() {
			return new Some(prop);
		}
	}
}

public class Second {
public static void main(String... args) {

	Some some = new Some.Builder()
		.setProp("toto")
		.build();

	out.println(some);

}
}

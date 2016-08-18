package misc.builders;

class Stuff {

static class Builder {

	/* bad static build method. forces static setters */
	static Stuff build() {
		return new Stuff();
	}
}
}

public class First {
public static void main(String... args) {

/*never used*/
Stuff s1 = Stuff.Builder.build();

}
}

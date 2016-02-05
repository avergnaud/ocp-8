package review.access.cat.species;
import review.access.cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String... a) {
		BigCat cat = new BigCat();
		//System.out.println(cat.hasFur);
		cat = new Lynx();
		//System.out.println(cat.hasFur);
		Lynx lynx = new Lynx();
		System.out.println(lynx.hasFur);
	}
	private void test() {
		System.out.println(hasFur);
	}
}
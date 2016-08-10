package oracle;

import java.util.stream.*;
import java.util.*;
import static java.lang.System.out;

//https://www.youtube.com/watch?v=UKuFqAhDEN4

class MyBean {
	boolean someCondition;
	int someAmount;
	MyBean(boolean b, int i) {
		someCondition=b;
		someAmount=i;
	}
	boolean isSomeCondition() {
		return someCondition;
	}
}

public class SomeNY {
public static void main(String... args) {
	MyBean[] myBeans = {
		new MyBean(true,2),
		new MyBean(false,1000),
		new MyBean(true, 4),
		new MyBean(false,5),
		new MyBean(true, 30),
		new MyBean(false,1)
	};

int somme1 = Arrays.stream(myBeans)/*myBeans.stream()*/
	.filter(MyBean::isSomeCondition)
	.mapToInt(m -> m.someAmount)/*map(m -> m.someAmount)*/
	.sum();
out.println(somme1);

int somme2 = Arrays.stream(myBeans)
	.filter(MyBean::isSomeCondition)
	.reduce(0,(i,b)->b.someAmount+i,(i1,i2)->i1+i2)/*reduce(0,(b,i)->b.someAmount+i)*/;
out.println(somme2);

int somme3 = Arrays.stream(myBeans)
	.filter(MyBean::isSomeCondition)
	.collect(
		Collectors.summingInt(b->b.someAmount)
	);
out.println(somme3);
}
}

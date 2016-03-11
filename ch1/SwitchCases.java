package ch1;

import static java.lang.System.*;

public class SwitchCases {
public static void main(String... args) {

char c = 'a';
out.println(Character.getNumericValue(c));//10
out.println((int)c);//97

switch(c) {
	case 10:
		out.println("10");
		break;
	case 97:
		out.println("case 97");
		break;
	/*case 'a':
		out.println("a");*/
}

out.println(10 == 'a');
out.println(97 == 'a');

}
}
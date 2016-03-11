package ch1.enums.staticstuff;
import static java.lang.System.*;
import java.util.*;

enum Case1 {
A,B,C;
private Case1() {
	//out.println(A);	
}
}

enum Case2 {
A,B,C;
//Case2[] myTab = {A};
}

enum Case3 {
A,B,C;
{
//Case2[] myLocalTab = {A};	
}
}

enum Case4 {
A,B,C;
static int test = 0;
private Case4 () {
	//out.println(test);
}
}

enum Case5 {
A,B,C;
static int test = 0;
//int[] myTab = {test};
}

enum Case6 {
A,B,C;
static int test = 0;
{
//int[] myLocalTab = {test};
}
}

enum Color {
        RED, GREEN, BLUE;
        static final Map<String,Color> colorMap = 
        new HashMap<String,Color>();
        Color() {
            //colorMap.put(toString(), this);
        }
    } 

/*
Static initialization of this enum type would throw a NullPointerException 
because the static variable colorMap is uninitialized when the constructors 
for the enum constants run. The restriction above ensures that such code won't compile.
*/
package ch3.full.can_use_both;

import java.util.*;

/*http://stackoverflow.com/questions/3486689/java-bounded-wildcards-or-bounded-type-parameter*/

class Shape {
void draw(_3 var) {}
}

public class _3 {

public void drawAll(List<? extends Shape> shapes){
    for (Shape s: shapes) {
        s.draw(this);
    }
}

public <T extends Shape> void drawAll2(List<T> shapes){
    for (Shape s: shapes) {
        s.draw(this);
    }
}

}

package ch1.nested;

public class Access {

private int i;
private static int j;

class Member {
 private int k = Access.this.i;
 private int l = Access.j;
}

void myMethod() {
class Local {
 int m = Access.this.i;
 int n = Access.j;
 Member o = new Member();
 int p = o.k;
}
}

}

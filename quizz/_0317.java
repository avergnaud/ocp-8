package quizz;

class A {
    public int getCode(){ return 2;}
}

class AA extends A { 
  public short getCode(){ return 3;}
}

public class _0317 {
    
    public static void main(String[] args) throws Exception {
         A a = new A();
        A aa = new AA();
        System.out.println(a.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}

package quizz;

import static java.lang.System.out;

public class _0366 {
   public static void main( String[] args){
       try{
           int i = 0;
           i =  Integer.parseInt( args[0] );
       }
       catch(NumberFormatException e){
          out.println("Problem in " + i );
       }
   }
}



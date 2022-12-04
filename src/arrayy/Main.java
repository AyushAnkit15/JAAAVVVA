package arrayy;

import static arrayy.maxProduct.mp;
import static arrayy.uniqueCharacter.uC;
import  static  arrayy.isPermutation.cP ;
public class Main {

    public static void main(String[] args) {
      int[] a = {1 ,2 ,  3, 4, 5, 6  };
      int[] b = {2 ,4 ,6, 1, 3, 5, };
      boolean s = cP(a , b) ;
        System.out.println(s);

    }


}



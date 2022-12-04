package arrayy;

public class isPermutation {
    public  static  boolean cP(int[]a  , int[] b ){
        boolean r = true ;
        if (a.length != b.length){
            r =false ;
        }
        int s1  = 0 , s2 =  0  ;
        int m1 = 1 ;
        int m2 = 1  ;
        for (int i = 0 ; i< a.length ; i++){
            s1 = s1 + a[i];
            m1 = m1*a[i];

        }

        for (int j = 0 ; j< a.length ; j++){
            s2 = s2 +a[j];
            m2 = m1*a[j];

        }
if ((s1==s2)& (m1==m2)){
  r = true ;
}

return r ;
    }
}

package arrayy;

public class uniqueCharacter {
    public  static  boolean uC(int[] a ){
        boolean r = true ;
        for (int  i= 0 ; i<a.length ; i++){
            for (int j =i+1 ; j<a.length ; j++){
                if (a[i]==a[j]){
                    //System.out.println(a[i]);
                    r = false ;
                }


            }
        }
        return r ;
    }
}

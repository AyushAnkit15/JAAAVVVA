package arrayy;

public class maxProduct {
    public  static String mp(int[]a){
        int maxp = 0 ;
        String pair ="";
        for (int i = 0 ; i<a.length ; i++){
            for (int  j =i+1; j<a.length ; j++){
                int m = a[i]*a[j];
                if (m>maxp){
                    maxp = m ;
                    pair =Integer.toString(a[i] )+ "," + Integer.toString(a[j]);

                }
            }
        }

        return pair ;

    }


}

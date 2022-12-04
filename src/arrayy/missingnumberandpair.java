package arrayy;

public class missingnumberandpair {
   static int mn(int arr[]){
      int sums=0 ;
       for (int  i = 0 ; i<arr.length ; i++){
           sums +=arr[i];

       }
       int rs =((arr.length+1)*(arr.length+2))/2 ;
       return rs - sums ;


   }

    public static void main(String[] args) {
        int [] arr1  = {1 ,2 ,3 ,4,6  ,5,7, 8,9,10 ,11, };
        int r = mn(arr1);

        System.out.println(r);



    }

}

package arrayy;
import java.util.Arrays  ;

public class TwoSum {
  public   static  int[] pair(int []arr , int x ){
        for(int  i = 0 ; i<arr.length ; i++){
            int d = x-arr[i];
            for(int j = i+1 ; j< arr.length ;j++){
                if (arr[j]==d){

                   // System.out.println("the required numbers are "+ arr[j]+ "and" + arr[i]);
                    return new int[] {i,j};

                }

            }
        }
        throw new IllegalArgumentException("No Solution Found");


    }

    public static void main(String[] args) {
        int []a = { 7  ,11, 2 ,15 } ;
        int[] b  =pair(a , 20);
        //System.out.println();



    }

}

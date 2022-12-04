package arrayy;

public class searchh {

    public  static void ls(int[]a , int x){
        for (int  i = 0 ; i<a.length ; i++){
            if (a[i]==x){
                System.out.println(i );
                return;
            }

        }
        System.out.println(x + " not found  ");

    }

    public static void main(String[] args) {
        int a[] ={2,4,6,8,10};
        ls(a,0);
    }
}

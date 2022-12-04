 package arrayy;

public class TwoDimensionalArray {
int arr[][] = null ;
public  TwoDimensionalArray(int rows , int columns){
 this.arr = new int[rows][columns];
 for(int i = 0 ; i<rows  ; i++){
  for(int j  = 0 ; j<columns;j++){
   arr[i][j]=Integer.MIN_VALUE;
  }

 }
}
public  void InsertValueInTheArray(int row , int col , int value){
 try {
  if (arr[row][col]==Integer.MIN_VALUE){
   arr[row][col]= value ;
   System.out.println("success");
  }
  else {
   System.out.println("occupied");
  }

 }
 catch (ArrayIndexOutOfBoundsException e){
  System.out.println("Invalid Index for 2D array ");
 }

}
public void accessCell(int row , int col ){
 System.out.println("accessing row number " + row + "and column number " + col);
 try {
  System.out.println("cell value is "+arr[row][col]);
  }

 catch (ArrayIndexOutOfBoundsException e ){
  System.out.println("Array out of bound ");
 }
}
public void  traverse2DArray(){
 int element = 0 ;

 for (int  i = 0 ; i<arr.length;i++){
  for (int  j = 0 ; j<arr[i].length;j++){
   System.out.println(arr[i][j]);
   element++;
  }
 }
 System.out.println(element);
}
public void linearSearchIn2DArray(int value){
 for (int  i = 0 ; i<arr.length;i++){
  for (int  j = 0 ; j<arr[i].length;j++){
  if (arr[i][j]==value){
   System.out.println("the row is " + i + " and the column is "+ j);
   return ;
  }

  }
 }
 System.out.println("nahi hai");
}

}

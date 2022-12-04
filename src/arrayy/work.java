
package arrayy;
import java.util.Arrays;

public class work {
    public static void main(String[] args) {
TwoDimensionalArray sda = new TwoDimensionalArray(3,3) ;
sda.InsertValueInTheArray(0,0,10);
sda.InsertValueInTheArray(0  , 1 , 5);
sda.InsertValueInTheArray(0 , 2 ,7 );
sda.InsertValueInTheArray(1 , 0 , 4 );
sda.InsertValueInTheArray(1 ,1,19);
sda.InsertValueInTheArray(1 ,2 ,3);
sda.InsertValueInTheArray(2,0 ,7);
sda.InsertValueInTheArray(2 ,1, 13);
sda.InsertValueInTheArray(2 ,2 ,6);
sda.traverse2DArray();
/*sda.InsertValueInTheArray( 0, 0  ,20 );
sda.InsertValueInTheArray(3,4 , 10 );*/
        sda.accessCell(0,0);
        sda.linearSearchIn2DArray(22);

    }

}

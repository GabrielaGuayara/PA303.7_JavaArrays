import java.util.Arrays;

public class ForLoopTwo {
    public static void main(String[] args) {
// Write a sto the corresponding index in the array.

   int[] arrayOfFive = new int[5];

   for(int i = 0; i < arrayOfFive.length; i++){
       arrayOfFive[i] = i*2;
   }

        System.out.println(Arrays.toString(arrayOfFive));

    }
}

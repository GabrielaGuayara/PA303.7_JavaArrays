import java.util.Arrays;

public class ForLoopOne {
    public static void main(String[] args) {
//        Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.

        int [] arrayOfInt = new int[5];

        for (int i = 0; i < arrayOfInt.length; i++){
            arrayOfInt[i] = i;
        }
        System.out.println(Arrays.toString(arrayOfInt));

    }
}

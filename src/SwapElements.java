import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
//        Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.

        int [] array = { 1, 2, 3, 4, 5};
       int temp;

       temp = array[0];
       array[0] = array[array.length -1] ;
       array[array.length - 1] = temp;


        System.out.println(Arrays.toString(array));
    }
}

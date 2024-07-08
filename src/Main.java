import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/

        int [] array = new int[3];
        array[0] = 1;
        array[1] =2;
        array[2] = 3;


        for(int element: array){
            System.out.println("Array element: " + element);
        }
    }
}
import java.util.Arrays;

public class UsingClone {
    public static void main(String[] args) {
//        Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

        String [] array = {"red", "green", "blue", "yellow"};
        System.out.println(array.length);

        String [] newArray = array.clone();

        System.out.println(Arrays.toString(newArray));

    }
}

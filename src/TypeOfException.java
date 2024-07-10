public class TypeOfException {
    public static void main(String[] args) {
//        Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.

        int [] array = {1,2,3,4,5};
        int lastIndex = array.length -1;
        System.out.println("First Element: " + array[0] );
        System.out.println("Last Element: " + array[lastIndex]);

        System.out.println("Error: " + array[-1]);
        array[lastIndex] = 5;


    }
}

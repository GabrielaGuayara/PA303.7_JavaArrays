public class ExcepMiddleEl {
    public static void main(String[] args) {
// Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.

   int [] array = {1, 2, 3, 4, 5};

   for (int i = 0; i < array.length; i++ ){
       int element = array[2];

       if(array[i] != element)
           System.out.println(array[i]);
        }
    }
}

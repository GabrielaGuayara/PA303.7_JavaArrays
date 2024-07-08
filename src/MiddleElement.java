public class MiddleElement {
    public static void main(String[] args) {
//        Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int [] array = {13, 5, 7, 68, 2};
        int element = array[(array.length)/2];
        System.out.println(element);

    }
}

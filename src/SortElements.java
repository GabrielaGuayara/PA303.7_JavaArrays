import java.util.Arrays;

public class SortElements {
    public static void main(String[] args) {
//        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
//        Array in ascending order: 0, 1, 2, 4, 9, 13
//        The smallest number is 0
//        The biggest number is 13


        int[] array = {4 ,2, 9, 13, 1, 0};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i< array.length; i++){
            if(array[i]< minVal)
               minVal = array[i];
        }

        System.out.println(minVal);

        for(int i=0; i< array.length; i++){
            if(array[i] > maxVal)
                maxVal = array[i];
        }

        System.out.println(maxVal);
    }
}

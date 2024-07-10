import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
//  Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.

        Scanner inp = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int userInp = inp.nextInt();

        String[] arrayOfThings = new String[userInp];


        for(int i = 0; i< arrayOfThings.length; i++){
            System.out.print("Enter your thing: ");
           Scanner newInp= new Scanner(System.in);
           String newThing = newInp.nextLine();
           arrayOfThings[i] = newThing;
        }


       System.out.println("\nArray of Favorite Things: " + Arrays.toString(arrayOfThings));

    }
}

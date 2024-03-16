package labs_examples.arraysX.labs;


/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
       String userInput = args[0];
       int convertedInput = Integer.parseInt(userInput);

       int count = 0;
       for(int num : array) {
           if(num == convertedInput) {
               System.out.println("index of " + num + " is " + count);
           }
           count++;
       }


    }
}
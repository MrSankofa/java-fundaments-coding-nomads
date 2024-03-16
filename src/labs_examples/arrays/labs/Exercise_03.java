package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] fiveByFive = new int[5][5];

        int multiple = 1;
        for(int row = 0; row < fiveByFive.length; row++) {
            for(int col = 0; col < fiveByFive.length; col++) {
                fiveByFive[row][col] = (multiple) * 3;
                multiple++;
            }
        }

        for(int[] row : fiveByFive){
            int count = 1;
            for(int cell : row) {
                if(count % 5 == 0) {
                    System.out.println(cell + " ");
                } else {
                    System.out.print(cell + " ");
                }
                count++;
            }

        }



        
    }
}

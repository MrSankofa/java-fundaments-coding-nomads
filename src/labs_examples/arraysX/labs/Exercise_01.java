package labs_examples.arraysX.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

  public static void main(String[] args) {
    System.out.println("result of reduceArray: " + reduceArray(1,2,3,4,5,6,7,8,9,10));

  }
  static int reduceArray(int ... a) {
    int count = 0;
    int[] myArr = new int[10];


    for(int num : a) {
      myArr[count] = num;
      count++;
    }

    int sum = 0;

    for(int num : myArr) {
      sum += num;
    }

    return sum;
  }

}
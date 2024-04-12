package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class MyThread extends Thread {
  Thread thread;


  @Override()
  public void run() {
    System.out.println("Hello extended thread");
  }
}

class Main {
  public static void main(String[] args) {

    // Step 1) create the generic method as
    // instructed in the NumericExample class

    // Step 2) call that method and pass two doubles
    double result = NumericExample.sum(2.03 , 2.91);
    System.out.print("Result:");
    System.out.print(result);
    System.out.println("");
    // Step 3) call that method and pass two ints
    double result2 = NumericExample.sum(2 , 4);
    System.out.print("Result2:");
    System.out.print(result2);
    System.out.println("");
    // Step 4) call that method and pass two floats
    double result3 = NumericExample.sum(2.0f , 4.2f);
    System.out.print("Result3:");
    System.out.print(result3);
    System.out.println("");
    // Step 5) call that method and pass one int and one double
    double result4 = NumericExample.sum(2.0f , 3);
    System.out.print("Result4:");
    System.out.print(result4);
    System.out.println("");

  }
}

class NumericExample<T> {

  /* 1) Write a generic method below that
      will return the sum of ANY two numeric
      values no matter what their specific data
      type is. And remember, the values must
      be Numeric - meaning, you must use a
      bounded type */
  public static <T extends Number> double sum(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
  }

}

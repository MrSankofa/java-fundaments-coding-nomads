package labs_examples.multi_threading.labs;

import java.util.ArrayList;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class GenericMethodTest {
  // declare generic printArray() method
  public static  < T > void printElement(T element ) {
    System.out.print(element);
  }

  public static void main(String args[]) {
    /* Create arrays of Integer,
        Double and Character */
    GenericMethodTest.printElement("This is generic");
    GenericMethodTest.printElement(3234);
    GenericMethodTest.printElement(3834F);
  }
}

package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

//class MyThread extends Thread {
//  Thread thread;
//
//
//  @Override()
//  public void run() {
//    System.out.println("Hello extended thread");
//  }
//}

class Main {
  public static void main(String[] args) {
    System.out.println("max" + getMax(1,2,3));
  }

  public static  <T extends Comparable<T>> T getMax(T x, T y, T z) {
    // assume x is initially the largest
    T max = x;

    if(y.compareTo(max) > 0) {
      // max is now y
      max = y;
    }

    if(z.compareTo(y) > 0) {
      // max is now z
      max = z;
    }

    // return the largest object
    return max;
  }

}


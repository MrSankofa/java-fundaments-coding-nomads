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
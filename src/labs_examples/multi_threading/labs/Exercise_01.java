package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class MyThread implements Runnable {
   MyThread() {
     Thread thread = new Thread();

     thread.start();
   }

   @Override
   public void run() {
     System.out.println("Hello new threed");
   }
}


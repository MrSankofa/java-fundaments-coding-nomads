package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */


// correct
@FunctionalInterface
interface Exercise1Interface {
  void abMethod();
}

@FunctionalInterface
interface Exercise2Interface {
  void abMethod();
}

@FunctionalInterface
interface Exercise3Interface {
  int identity(int a);
}

public class Exercise_01 {

  Exercise2Interface innerClass = new Exercise2Interface() {
    @Override
    public void abMethod() {
      System.out.println("abMethod");
    }
  };

  public static void main(String[] args) {
    Exercise2Interface obj = () -> System.out.println("Hello World");

    obj.abMethod();

    Exercise2Interface innerClass = new Exercise2Interface() {
      @Override
      public void abMethod() {
        System.out.println("Hello inner class method");
      }
    };

    innerClass.abMethod();

    Exercise3Interface returnIdentity = new Exercise3Interface() {
      @Override
      public int identity(int a) {
        return a;
      }
    };

    int result = returnIdentity.identity(3);

    System.out.println("Here is my result : " + result);

  }


}


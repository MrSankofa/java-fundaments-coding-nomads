package labs_examples.variables;

public class Variables {
  // gloab variable
  // field
  static double  val = 123.34;
  public static void main(String[] args) {
    Person myPerson = new Person(37, "Brett");
    Person yourPerson = new Person(37, "Somebody");
    Person theirPerson = new Person(37, "Einstein");
    Person anotherPerson = new Person(37, "another");

    // instance variable
    System.out.println(myPerson.toString());
    System.out.println(yourPerson.toString());
    System.out.println(theirPerson.toString());
    System.out.println(anotherPerson.toString());

    // static variable will make sure they share the same value
  }



  public static int multiply(int a, int b) {
    int result = a * b;
    return result;
  }

//  public static void test(){
//    // result is not accessible other functions
//    System.out.println(result);
//  }

}

package labs_examples.objects_classes_methods_target.labs.methods;

public class Exercise_02_method_overloading {
  public static void main(String[] args) {
    // 1
    multiply(1.03F, 39.93F);

    //2
    int x = 2;
    System.out.println("this is my x before " + x);
    multiply(x, x);
    System.out.println("this is my x after " + x);

    Person brett = new Person("brett", 37);
    System.out.println("This is brett result before " + brett.result);

    Person courtney = new Person("Courtney", 36);
    System.out.println("This is Courtney result before " + courtney.result);

    System.out.println("multiply(brett, courtney) " + multiply(brett, courtney));
    System.out.println("This is brett result after " + brett.result);
    System.out.println("This is Courtney result after " + courtney.result);

  }

  static float multiply(float a, float b) {
    return a * b;
  }

  static float multiply(Person a, Person b) {
    a.result = a.age * b.age;
    b.result = a.age * b.age;

    return a.result;
  }

  static class Person {
    String name;
    int age;
    int result = 0;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

  }
}

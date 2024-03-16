package labs_examples.variables;

public class Person {
  int age;
  String name;

  static int numPersonsCreated;




  public Person(int age, String name) {
    this.age = age;
    this.name = name;
    numPersonsCreated++; // static variables are shared so they will be updated in every instance
  }

  @Override
  public String toString() {
    return "Person{" +
        "name= " + name + '\'' +
        ", age= " + age +
        ", numPersonsCreated= " + numPersonsCreated +
        "}";


  }

}

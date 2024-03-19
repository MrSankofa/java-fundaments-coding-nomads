package labs_examples.objects_classes_methods_target.labs.oop.A_inheritance;

public class inheritance_ex_04 {
  public static void main(String[] args)
  {
    Parent c = new Child();
    c.doSomething(); // the methods are based on the class the new keyword was created on
    System.out.println(c.i);  // the instance variables are based off of the Type
  }
}

class Parent
{
  int i = 10;
  public void doSomething()
  {
    System.err.println("Parent called");
  }
}

class Child extends Parent
{
  int i = 20;
  public void doSomething()
  {
    System.err.println("Child called");
  }
}
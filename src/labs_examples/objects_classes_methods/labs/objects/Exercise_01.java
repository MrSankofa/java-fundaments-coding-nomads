package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {
  public static void main(String[] args) {
    Airplane my747 = new Airplane(new Pilot("Brett", 37), new Company("Boeing", 1983));
  }

}

// create your first class below this line
class Airplane {
  Pilot pilot;
  Company company;

  Airplane(Pilot pilot, Company company) {
    this.pilot = pilot;
    this.company = company;
  }
}

// create your second class below this line
class Pilot {

  private String name;
  private int age;

  Pilot(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

// create your third class below this line
class Company {
  private int since;



  private String name;

  Company(String name, int since) {
    this.since = since;
    this.name = name;
  }

  public void setSince(int since) {
    this.since = since;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getSince() {
    return since;
  }
}


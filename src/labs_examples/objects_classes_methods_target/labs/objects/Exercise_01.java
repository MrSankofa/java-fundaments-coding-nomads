package labs_examples.objects_classes_methods_target.labs.objects;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_01 {
  public static void main(String[] args) {
    Airplane my747 = new Airplane(new Pilot("Brett", 37), new Company("Boeing", 1983));
    Airplane B52 = new Airplane(new Pilot("Dwight Eisenhower", 96), new Company("USA", 1776));
    my747.setName("747");
    B52.setName("B52");

    Airplane mustang = new Airplane("mustang");

    Amenities amenities = new Amenities();
    amenities.entertainment = new ArrayList<String>(Arrays.asList("Movies", "Internet", "Snacks"));

    Airplane deltaStandard = new Airplane("deltaStandard", amenities);

    my747.pilot.setName("Brett Cunningham II");
    System.out.println("How old is Brett? " + my747.pilot.getAge());


    my747.amenities.entertainment.add("Movies");
    my747.amenities.entertainment.add("Internet");
    my747.amenities.entertainment.add("Live TV");

    PlaneEngine pEngine = new PlaneEngine();
    pEngine.setBrand("Chevrolet");
    pEngine.setName("V8");

    my747.setEngine(pEngine);

    System.out.println("Here is my 747: " + my747);
    System.out.println("Here is my B52: " + B52);
    System.out.println("Here is my mustang: " + mustang);
    System.out.println("Here is my deltaStandard: " + deltaStandard);

    Hanger dtwHanger = new Hanger();
    dtwHanger.planesHeld.add(my747.getName());
    dtwHanger.planesHeld.add(B52.getName());
    dtwHanger.planesHeld.add(mustang.getName());
    dtwHanger.planesHeld.add(deltaStandard.getName());
    dtwHanger.setBay("6");

    System.out.println("My hanger: " + dtwHanger);
  }

}

// create your first class below this line
class Airplane {
  Pilot pilot;
  Company company;
  Amenities amenities = new Amenities();
  PlaneEngine engine = new PlaneEngine();



  String name;
  double fuelCapacity;
  double currentFuelLevel;

  Airplane(Pilot pilot, Company company) {
    this.pilot = pilot;
    this.company = company;
  }

  Airplane(String name) {
    this.name = name;
  }

  Airplane(String name, Amenities amenities) {
    this.name = name;
    this.amenities = amenities;
  }

  public Amenities getAmenities() {
    return amenities;
  }

  public void setAmenities(Amenities amenities) {
    this.amenities = amenities;
  }

  public PlaneEngine getEngine() {
    return engine;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEngine(PlaneEngine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Airplane{" +
        pilot +
        company +
        amenities +
        engine +
        fuelCapacity +
        currentFuelLevel +
        '}';
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

  @Override
  public String toString() {
    return "Pilot{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
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

  @Override
  public String toString() {
    return "Company{" +
        "since=" + since +
        ", name='" + name + '\'' +
        '}';
  }
}

class PlaneEngine {


  private String name;
  private String Brand;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return Brand;
  }

  public void setBrand(String brand) {
    Brand = brand;
  }

  @Override
  public String toString() {
    return "PlaneEngine{" +
        "name='" + name + '\'' +
        ", Brand='" + Brand + '\'' +
        '}';
  }
}

class Amenities {
  ArrayList<String> entertainment = new ArrayList<String>();

  @Override
  public String toString() {
    return "Amenities{" +
        "entertainment=" + entertainment +
        '}';
  }
}

// exercise 3
class Hanger {
  private String bay;
  ArrayList<String> planesHeld = new ArrayList<String>();

  public String getBay() {
    return bay;
  }

  public void setBay(String bay) {
    this.bay = bay;
  }

  @Override
  public String toString() {
    return "Hanger{" +
        "bay='" + bay + '\'' +
        ", planesHeld=" + planesHeld +
        '}';
  }
}

// (DONE) exercise 1 asks for an airplane class composed of 4 other classes
// (DONE) exercise 1 asks for an airplane class composed of 4 other classes


// (DONE) exercise 2 asks you to change the instance variables to private and create get/set for each ins var
// (DONE) also create a toString method in each POJO
// (DONE) demo getting the variables from the class you composed the airplane object and invoking the to string methods


// (Done) exercise 3 - demo object association in the Exercise_01 controller class (it contains the main() method)
// (Done) create at least 2 POJOs
// (Done) associate the 2 objects together




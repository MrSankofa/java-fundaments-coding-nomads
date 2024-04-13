package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum BANKS {
  CHASE("Chase"),
  SANTANDER("Santander"),
  CAPITALONE("CapitalOne");

  String name;

  BANKS(String name) {
    this.name = name;
  }
}

class Exercise_01 {

  public static void main(String[] args) {
    TestBanks firstBank = new TestBanks(BANKS.CHASE);
    boolean result = firstBank.isMyBank(BANKS.SANTANDER);

    System.out.println("is this my bank? " + result);
  }

}


class TestBanks {

  BANKS bank;

  TestBanks(BANKS bank){
    this.bank = bank;
  }

  void setBank(BANKS bank) {
    this.bank = bank;
  }

  boolean isMyBank(BANKS bank) {
    return bank == this.bank;
  }
}
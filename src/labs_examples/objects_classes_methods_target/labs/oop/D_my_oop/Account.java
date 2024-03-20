package labs_examples.objects_classes_methods_target.labs.oop.D_my_oop;

import java.util.HashSet;
import java.util.Set;

public class Account {
  private float balance = 0;
  private String name;
  static Set<String> accountSet = new HashSet<String>();


  Account(String name) {
    this.name = name;
    accountSet.add(name);
  }

  Account(String name, float balance) {
    this.name = name;
    this.balance = balance;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(accountSet.contains(this.name)) {
      accountSet.remove(this.name);
    }

    this.name = name;
    accountSet.add(this.name);
  }

}

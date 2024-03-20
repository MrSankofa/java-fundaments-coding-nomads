package labs_examples.objects_classes_methods_target.labs.oop.D_my_oop;

public class Expense {
  private String name;
  private Float amount;
  private int dueDate;
  private String account;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public int getDueDate() {
    return dueDate;
  }

  public void setDueDate(int dueDate) {
    this.dueDate = dueDate;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    if(Account.accountSet.contains(account)) {
      this.account = account;
    } else {
      // TODO: Notify user that account did not exist do you want to create it maybe
     // throw an custom exception that the account does not exist
    }
  }
}

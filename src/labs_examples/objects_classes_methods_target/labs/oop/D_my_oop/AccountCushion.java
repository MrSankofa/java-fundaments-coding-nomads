package labs_examples.objects_classes_methods_target.labs.oop.D_my_oop;



public class AccountCushion extends Account{



  AccountCushion(String name) {
    super(name);

    switch (name) {
      case "CHASEZIEGLER":
        this.setBalance(4947.00F);
      case "CHASEPERSONAL":
        this.setBalance(5165.37F);
      case "CHASEALTRUISTIC":
        this.setBalance(2222.00F);
      case "CHASEARECAPITAL":
        this.setBalance(2170.00F);
      case "INDEPENDENTBANK":
        this.setBalance(4950.00F);
      case "SANTANDER":
        this.setBalance(1452.43F);
    }
  }


}


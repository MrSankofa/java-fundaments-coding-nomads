package labs_examples.exception_handling.labs;
class Main {
  public static void main(String[] args){
    // generate and throw teapot error here
    try {
      run();
    } catch( TeaPotException e ) {
      System.out.println(e.toString());
    }


  }

  public static void run() throws TeaPotException {
    System.out.println("Are you a teapot? (Y/N)");
    String myObj = "Y";

    if(myObj == "Y") {
      throw new TeaPotException();
    } else {
      System.out.println("Glad to hear you're not");
    }
  }
}


// create your custom `TeaPotException` class here
class TeaPotException extends Exception {
  public int errorCode = 418;

  @Override
  public String toString() {
    return "I am a teapot";

  }
}

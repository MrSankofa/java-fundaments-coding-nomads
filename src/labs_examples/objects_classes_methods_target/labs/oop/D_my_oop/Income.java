package labs_examples.objects_classes_methods_target.labs.oop.D_my_oop;

import java.util.HashMap;
import java.util.Map;

public class Income {

  private HashMap<String, Float> monthlyIncome = new HashMap<String, Float>();
  private Map<String, Float> yearlyIncome = new HashMap<String, Float>();

  Income(HashMap<String, Float> monthlyIncome) {
    this.monthlyIncome = monthlyIncome;
  }

  Income(Map<String, Float> yearlyIncome) {
    this.yearlyIncome = yearlyIncome;
  }

  public HashMap<String, Float> getMonthlyIncome() {
    return monthlyIncome;
  }

  public void addNewMonthlyIncome(String date, Float amount) {
    this.monthlyIncome.put(date, amount);
  }

  public Map<String, Float> getYearlyIncome() {
    return yearlyIncome;
  }

  public void addNewYearlyIncome(String date, Float amount) {
    this.yearlyIncome.put(date, amount);
  }

  //  TODO implement removing monthly and year income

}

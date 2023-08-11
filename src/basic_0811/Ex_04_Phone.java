package basic_0811;

public class Ex_04_Phone {
  private static long numOfPhones;
  String model;
  int value;

//  public Ex_04_Phone() {}


  public Ex_04_Phone(String model, int value) {
    this.model = model;
    this.value = value;
    numOfPhones++;
  }

  public static long getNumOfPhones() {
    return numOfPhones;
  }

  public void print() {

    System.out.println(value + "원 짜리 " + model + "의 스마트폰");
  }
}

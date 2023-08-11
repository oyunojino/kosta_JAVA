package basic_test_0811;

public class Ex_01_uml_test_Lamp {
  boolean status;
  String on = "켜짐";
  String off = "꺼짐";

  public void turnOn() {
    status = true;
  }

  public void turnOff() {
    status = false;
  }
}

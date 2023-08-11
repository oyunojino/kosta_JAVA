package basic_0811;

public class Ex_08_Circle {
  double radius = 1.0;
  String color = "Black";

  public Ex_08_Circle() {
    radius = 1.0;
    color = "Black";
  }

  public Ex_08_Circle(double radius) {
    this.radius = radius;
  }

  public Ex_08_Circle(String color) {
    this.color = color;
  }

  public Ex_08_Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
}

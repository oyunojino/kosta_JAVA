package basic_0811.circle;

public class Circle_2 {
  double radius = 1.0;
  String color = "Black";

  public Circle_2() {
    this(1.0,"Black");
  }

  public Circle_2(double radius) {
    this(radius, "Black");
  }

  public Circle_2(String color) {
    this(1.0, color);
  }

  public Circle_2(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
}

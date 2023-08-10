package basic_0810;

public class Ex_14_class_1_circle {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.05);
    System.out.println("circle = " + circle.getRadius());
  }
}

class Circle {
  private double radius = 0.0;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

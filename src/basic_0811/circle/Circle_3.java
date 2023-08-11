package basic_0811.circle;

public class Circle_3 {
  private static long numberOfCircles;
  private static long getNumberOfRedCircles;
  private double radius;
  private String color;

  public Circle_3(double radius, String color) {
    this.radius = radius;
    this.color = color;
    numberOfCircles++;
    if (color.equalsIgnoreCase("red")) {
      getNumberOfRedCircles++;
    }
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public static long getNumberOfCircles() {
    return numberOfCircles;
  }

  public static long getGetNumberOfRedCircles() {
    return getNumberOfRedCircles;
  }
}

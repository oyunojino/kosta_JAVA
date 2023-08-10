package basic_0810;

public class Ex_15_class_2_useCircle {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(20.0);
    System.out.println("c.getRadius() = " + c.getRadius());

    Circle c2 = new Circle(30.0);
    System.out.println("c2.getRadius() = " + c2.getRadius());
  }
}

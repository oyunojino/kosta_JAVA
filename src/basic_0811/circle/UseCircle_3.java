package basic_0811.circle;

public class UseCircle_3 {
  public static void main(String[] args) {
    Circle_3 c1 = new Circle_3(5.0, "yellow");
    Circle_3 c2 = new Circle_3(1.0, "red");
    Circle_3 c3 = new Circle_3(3.0, "RED");

    System.out.println(Circle_3.getNumberOfCircles());
    System.out.println(Circle_3.getGetNumberOfRedCircles());
  }
}

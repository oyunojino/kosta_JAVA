package basic_0811.circle;

public class UseCircle_2 {
  public static void main(String[] args) {
    Circle_2 c1 = new Circle_2();
    Circle_2 c2 = new Circle_2(10.0);
    Circle_2 c3 = new Circle_2("Red");
    Circle_2 c4 = new Circle_2(20.0,"Yellow");

    System.out.println("c1.color = " + c1.color);

  }
}

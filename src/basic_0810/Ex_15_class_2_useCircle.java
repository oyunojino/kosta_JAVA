package basic_0810;

public class Ex_15_class_2_useCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(-1.0);
//    System.out.println("c.getRadius() = " + c.getRadius());
    System.out.println("c1 할당 전");
    System.out.println("c1 = " + c1);

    Circle c2 = new Circle(30.0);
//    System.out.println("c2.getRadius() = " + c2.getRadius());
    System.out.println("c2 할당 전");
    System.out.println("c2 = " + c2);

    c1 = c2;
    System.out.println("할당 후 (c1 = c2)");
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
  }
}

package basic_0811;

public class Ex_09_useCircle {
  public static void main(String[] args) {
    Ex_08_Circle c1 = new Ex_08_Circle();
    Ex_08_Circle c2 = new Ex_08_Circle(10.0);
    Ex_08_Circle c3 = new Ex_08_Circle("Red");
    Ex_08_Circle c4 = new Ex_08_Circle(20.0,"Yellow");

    System.out.println("c1.color = " + c1.color);

  }
}

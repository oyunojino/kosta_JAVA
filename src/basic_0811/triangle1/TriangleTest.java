package basic_0811.triangle1;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t = new Triangle(10.0, 5.0);
    System.out.println("삼각형의 넓이는 " + t.findArea() + "입니다.");
  }
}

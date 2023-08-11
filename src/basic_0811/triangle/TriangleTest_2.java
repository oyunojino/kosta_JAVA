package basic_0811.triangle;

public class TriangleTest_2 {
  public static void main(String[] args) {
    Triangle_2 t1 = new Triangle_2(10.0, 5.0);
    Triangle_2 t2 = new Triangle_2(5.0, 10.0);
    Triangle_2 t3 = new Triangle_2(8.0, 8.0);

    System.out.println(t1.isSameArea(t2));
    System.out.println(t1.isSameArea(t3));
  }
}

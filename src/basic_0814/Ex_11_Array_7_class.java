package basic_0814;

import basic_0811.circle.Circle_2;

public class Ex_11_Array_7_class {
  public static void main(String[] args) {
    Circle_2[] circles = new Circle_2[5];
    System.out.println(circles);
    for (int i = 0; i < circles.length; i++) {
      if (i < 2) {
        circles[i] = new Circle_2();
      }
    }

    for (Circle_2 c: circles) {
      System.out.println(c);
    }
  }
}

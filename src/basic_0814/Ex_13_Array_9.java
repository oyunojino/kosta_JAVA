package basic_0814;

import basic_0810.Ex_14_class_1_circle;

public class Ex_13_Array_9 {

  public static void main(String[] args) {
    Ex_14_class_1_circle c1 = new Ex_14_class_1_circle(10.0);
    Ex_14_class_1_circle c2 = new Ex_14_class_1_circle(10.0);

    zero(c1);
    System.out.println("메서드 실행 후 반지름 c1 : " + c1.getRadius());
    zero(c2.getRadius());
    System.out.println("메서드 실행 후 반지름 c2 : " + c2.getRadius());

  }

  public static void zero(Ex_14_class_1_circle c) {
    c.setRadius(1.0);
  }

  public static void zero(double r) {
    r = 1.0;
  }
}

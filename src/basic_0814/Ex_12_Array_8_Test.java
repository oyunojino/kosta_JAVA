package basic_0814;

import basic_0810.Ex_14_class_1_circle;

public class Ex_12_Array_8_Test {
  /**
   * # test_1
   * findArea() 가 있는 circle을 원소로 가지는 배열, 배열 크기는 5
   * 각 circle에 radius 다르게 초기화(1.0, 2.0, 3.0, 4.0, 5.0)
   * 5개의 원의 넓이를 출력
   */
  public static void main(String[] args) {
    Ex_14_class_1_circle[] circles = new Ex_14_class_1_circle[5];
    int i;
    for (i = 0; i < circles.length; i++) {
      circles[i] = new Ex_14_class_1_circle((double) i + 1);
    }
    i = 1;
    for (Ex_14_class_1_circle circle : circles) {
      System.out.printf("원[%d]의 넓이 = %.2f\n", i++, circle.findArea());
    }


    for (Ex_14_class_1_circle circle : circles) {
      System.out.println("반지름 변경 메서드 실행 전 : " + circle.getRadius());
      change(circle);
      System.out.println("-> 반지름 변경 메서드 실행 후 : " + circle.getRadius());
    }

    /**
     * # test_2
     *     원의 반지름을 1씩 증가시키는 change 함수 생성
     *     함수 실행 전 반지름 (1.0, 2.0, 3.0, 4.0, 5.0)
     *     함수가 실행된 이후에 원의 반지름이 1씩 증가할 수 있도록 참조변수를 매개변수로 하는 메서드 작성
     *     함수 실행 후 반지름 (2.0, 3.0, 4.0, 5.0, 6.0)
     */
  }

  private static void change(Ex_14_class_1_circle circle) {
    circle.setRadius(circle.getRadius() + 1);
  }
}

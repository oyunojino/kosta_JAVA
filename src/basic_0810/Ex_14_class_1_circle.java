package basic_0810;

public class Ex_14_class_1_circle {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.05);
    System.out.println("circle = " + circle.getRadius());
  }
}

class Circle {
  private double radius = 0.0;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  /**
   * 원의 넓이를 구하는 findArea 메서드
   * 조건 -> Math.PI() 사용, 소수 두번쨰 자리까지
   * 공식 -> 반지름 * 반지름 * 원주율
   *
   * @return
   */
  public double findArea() {
    return Math.round(((radius * radius * Math.PI)*100)/100.0);
    //TODO
  }

  public void setRadius(double radius) {
    if (radius <= 0.0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    } else {
      this.radius = radius;
    }
  }
}

package basic_0811.triangle;

/**
 * Q1: 삼각형을 나타내는 Triangle 클래스를 작성
 * 속성 -> 밑변(실수), 높이(실수)
 * 동작 -> 넓이 구하기, 접근자, 생성자
 * <p>
 * Q2: 1번에 작성한 Triangle 클래스에 2개의 삼각형 넓이가 동일한지 비교
 * 메서드명 -> isSameArea()
 */
public class Triangle_2 {
  private double width = 0.0;
  private double height = 0.0;

  // 생성자
  public Triangle_2(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double width) {
    if (width <= 0.0) {
      System.out.println("삼각형의 밑변은 0보다 커야 합니다.");
      return;
    }
    this.width = width;
  }

  public void setHeight(double height) {
    if (height <= 0.0) {
      System.out.println("삼각형의 높이는 0보다 커야 합니다.");
      return;
    }
    this.height = height;
  }

  public double findArea() {
    return width * height / 2;
  }

  public boolean isSameArea(Triangle_2 t2) {
//    if (this.findArea() == t2.findArea()) {
//      return true;
//    }
//    if (this.findArea() != t2.findArea()) {
//      return false;
//    }
    return this.findArea() == t2.findArea();
  }
}

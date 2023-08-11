package basic_0811.triangle;

/**
 * Q: 삼각형을 나타내는 Triangle 클래스를 작성
 * 속성 -> 밑변(실수), 높이(실수)
 * 동작 -> 넓이 구하기, 접근자, 생성자
 */
public class Triangle_1 {
  private double width = 0.0;
  private double height = 0.0;

  // 생성자
  public Triangle_1(double width, double height) {
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
}

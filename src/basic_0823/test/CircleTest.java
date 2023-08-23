package basic_0823.test;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if (c1.equals(c2)) {
      System.out.println("c1과 c2는 같다.");
    } else {
      System.out.println("c1과 c2는 다르다.");
    }
  }
}

class Circle {
  int r;

  public Circle(int r) {
    this.r = r;
  }

  //  오버라이딩
  @Override
  public boolean equals(Object obj) {
//    # 오류가 나는 이유
//    => 다운캐스팅이 안되어있기 때문에
    if (obj instanceof Circle circle) {
      if (circle != null || this.r == circle.r) {
        return true;
      }
    }
    return false;
  }

// 오버로딩
//  public boolean equals(Circle circle) {
//    if(this.r == circle.r) {
//      return true;
//    }
//    return false;
//  }

}

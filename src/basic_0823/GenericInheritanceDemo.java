package basic_0823;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beer> a1 = new ArrayList<>();
    ArrayList<Boricha> a2 = new ArrayList<>();
    ArrayList<Beverage> a3 = new ArrayList<>();

    a3.add(new Beverage());
    a3.add(new Beer());
    a3.add(new Boricha());

    Beer beverage = (Beer) a3.get(1);
    System.out.println(bevarageTest(a3));

    
    bevarageTest(a3); // true
//    bevarageTest(a2);
// 사용 불가능 클래스의 상속관계는 제네릭 상속 관계에 영향을 주지 않음
    
  }
  static boolean bevarageTest(ArrayList<Beverage> array) {
    return true;
  }
}

package basic_0823;

import java.util.ArrayList;

public class GenericClass1Demo {
  public static void main(String[] args) {
    // get(데이터형 확인 O), set(데이터형 확인 X)
    Cup c = new Cup();
    c.setBeverage(new Boricha());
    if (c.getBeverage() instanceof Boricha) {
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer) {
      Beer beer = (Beer) c.getBeverage();
    }

    c.setBeverage(new Beer());
    c.setBeverage(new Beverage());
    c.setBeverage(new Object());

  // set(데이터형 확인 O) 컴파일 에러가 나도록 유도함
    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
//    arrayListBoricha.add(new Beer());

  }
}

class Beverage {

}

class Boricha extends Beverage {

}

class Beer extends Beverage {

}

class Cup {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
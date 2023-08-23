package basic_0823;

import java.util.ArrayList;

public class GenericClass1Demo {
  public static void main(String[] args) {
    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
    //arrayListBoricha.add(new Beer());
    ArrayList<Beer> arrayListBeer = new ArrayList<>();
    arrayListBeer.add(new Beer());
    //arrayListBeer.add(new Boricha())

    // get(데이터형 확인 O), set(데이터형 확인 X)
    Cup c = new Cup();
    c.setBeverage(new Boricha());
    if(c.getBeverage() instanceof Boricha){
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer){
      Beer beer= (Beer) c.getBeverage();
    }

    c.setBeverage(new Beer());
    Beer beer= (Beer) c.getBeverage();
    c.setBeverage(new Beverage());
    c.setBeverage(new Object());
    //beer= (Beer) c.getBeverage();

    // set(데이터형 확인 O) 컴파일 에러가 나도록 유도함
    Cup<Boricha> borichaCup = new Cup();
    borichaCup.setBeverage(new Boricha());
    Boricha boricha = borichaCup.getBeverage();

    Cup<Beer> beerCup = new Cup<>();
    beerCup.setBeverage(new Beer());
    //beerCup.setBeverage(new Boricha());
    beer = beerCup.getBeverage();
  }
}

class Beverage {

}

class Boricha extends Beverage {

}

class Beer extends Beverage {

}

class Cup<T> {
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
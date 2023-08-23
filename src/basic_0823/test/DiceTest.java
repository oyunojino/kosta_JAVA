package basic_0823.test;

import java.util.Random;

public class DiceTest {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());
  }
}

class Dice {
//  # Math.random()
//  int roll() {
//    int num = (int) (Math.random() * 6) + 1;
//    return num;
//  }

  //  # Random() 객체
  int roll() {
    Random random = new Random();

    return random.nextInt(1, 7);
  }
}

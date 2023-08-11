package basic_0811;

public class Ex_13_diceTest {
  public static void main(String[] args) {
    Ex_12_dice dice = new Ex_12_dice();
    for (int i = 0; i < 10; i++) {
      System.out.printf("주사위의 숫자는 %d 입니다.\n", dice.roll());
    }
  }
}

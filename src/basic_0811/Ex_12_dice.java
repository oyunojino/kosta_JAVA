package basic_0811;

/**
 * Q: 주사위를 나타내는 Dice 클래스 작성,
 * 조건 -> 0 <= Math.random() 활용
 */
public class Ex_12_dice {

  public Integer roll() {
//    경우 1
//    return (int) (Math.random() * 6) + 1;
//    경우 2
    return (int) Math.ceil((Math.random() * 6));
  }

}

package basic_0810;

public class Ex_11_method_3 {
  public static void main(String[] args) {

    MyMath myMath = new MyMath();
    long res1 = myMath.add(1000L, 200L);


  }


}
class MyMath {
  long div(long num1, long num2) {
    if (num2 == 0) {
      System.out.println("0으로 나눌 수 없다.");
      return 0L;
    }
    return num1 / num2;
  }

  long add(long num1, long num2) {
    return num1 + num2;
  }

}

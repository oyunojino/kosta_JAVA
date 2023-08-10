package basic_0810;

public class Ex_10_method_2_static {
  public static void main(String[] args) {
    long res1 = add(10L, 20L);
    long res2 = div(10L, 20L);
    System.out.printf("res1 = %d\nres2 = %d", res1, res2);
  }

  static long div(long num1, long num2) {
    if (num2 == 0) {
      System.out.println("0으로 나눌 수 없다.");
      return 0L;
    }
    return num1 / num2;
  }

  static long add(long num1, long num2) {
    return num1 + num2;
  }
}

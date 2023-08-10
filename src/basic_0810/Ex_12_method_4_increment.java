package basic_0810;

public class Ex_12_method_4_increment {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("함수 호출 전 x = " + x);
    incrememt(x);
    System.out.println("함수 호출 후 x = " + x);
  }
  static void incrememt(int num) {
    System.out.println("메서드 시작 num = " + num);
    num++;
    System.out.println("메서드 종료 num = " + num);
  }
}

package basic_0811;

public class Ex_07_localVar {
  public static void main(String[] args) {
    int a = 2;
    double b = 0.0; // 초기화 필수!!
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    for (int i = 0; i < 10; i++) {
      int c = 1;
      System.out.println("c = " + c);
      System.out.println("a = " + a);
    }
//    System.out.println("c = " + c);
  }
}

package basic_0825;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    MyFunction f = (a, b) -> a > b ? a : b ;

    int max = f.max(4, 6);
    System.out.println(max);
  }
}

@FunctionalInterface
interface MyFunction {
  int max(int a, int b);
//  # 익명이기 때문에 무조건 1개의 메서드만 가능
//  int min(int a, int b);
}
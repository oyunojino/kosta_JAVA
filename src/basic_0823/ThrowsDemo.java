package basic_0823;

import java.util.Scanner;

public class ThrowsDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      square(sc.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("정수가 아닙니다.");
    }
//    square(sc.nextLine());
  }

  private static void square(String s) throws NumberFormatException{
    int n = Integer.parseInt(s);
    System.out.println(n * n);
  }
}

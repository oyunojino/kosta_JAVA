package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("값을 입력하세요.");
//    int i = scanner.nextInt();
//    System.out.println(i);
    String s = scanner.nextLine();
    int i2 = Integer.parseInt(s);
    System.out.println(i2);


    int a = 1_000_000;
    int b = 2_000_000;
    long c = a * (long) b;
    System.out.println(c);

    double res = 5/0.0;
    double r = 5% 0.0;
    boolean b1 = Double.isInfinite(res);
    boolean b2 = Double.isNaN(r);

    System.out.println("res = " + (res+2));
    System.out.println("res = " + res);

    scanner.delimiter();
  }

}

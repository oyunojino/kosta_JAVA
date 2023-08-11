package basic_0809;

/**
 * Hello sample class
 * main-method
 * hello 출력하는 프로그램
 */
public class Hello {
  public static void main(String[] arg) {
    final double PI = 3.14159;
//    PI = 3.14
    var num = 100;
    int i = 2_100_000_000;
    Long i_long = 3_100_000_000L;

//    Long f = 3.14f;
    double d = (double) 3.14f;
    System.out.println(d);

    byte b = (byte) 300;
//    b = num;
    System.out.println(b); // 손실이 일어난값
    float f = (float)3.14;
    System.out.println(f);

//    String hello = "안녕!";
//    System.out.println(hello);
//    System.out.println("HELLO");

    char three = 3 + '0';
    int num2 = '3' - '0';
    String str3 = 3 + "";
    int i3 = Integer.parseInt(str3);
    int res = i3 + 10;
    double num3 = Double.parseDouble(str3);
    System.out.println(num2);

    char c = "30".charAt(1);

    double result = (double)7/(double)4; // 계산 전에 (double)이 묵시적으로 들어감
    System.out.println(result);
    System.out.printf("i = %d and d3 = %f\n", i, num3);

  }
}

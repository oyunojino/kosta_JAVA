package basic_0810;

public class Ex_09_method_1 {
  public static void main(String[] args) {
//    경우1
//    int sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum += i;
//    }
//    System.out.println("sum(1~10) = " + sum);
//
//    sum = 0;
//    for (int i = 10; i <= 100; i++) {
//      sum += i;
//    }
//    System.out.println("sum(10~100) = " + sum);
//
//    sum = 0;
//    for (int i = 100; i <= 1000; i++) {
//      sum += i;
//    }
//    System.out.println("sum(100~1000) = " + sum);
//  }

//    경우2
//    -> 코드의 재사용성을 높이는 방법
//    sum(1, 10);
//    sum(10, 100);
//    sum(100, 1000);

//    경우 3
//    System.out.printf("sum(1~10) = %d\n", sum2(1, 10));
//    System.out.printf("sum(10~100) = %d\n", sum2(10, 100));
//    System.out.printf("sum(100~1000) = %d\n", sum2(100, 1000));

//    경우 4
//    작은 값이 큰 값으로 들어가기 때문에 자동 형변환이 되어 L은 안 붙여도 됨
    System.out.printf("sum(1~10) = %d\n", sum3(1, 10L));
    System.out.printf("sum(10~100) = %d\n", sum3(10, 100L));
    System.out.printf("sum(100~1000) = %d\n", sum3(1_000_000_000, 1_000_000_000));
  }

  static void sum(int num1, int num2) {
//    만약 long으로 변경 X하면, outOfRange 오류가 남
    int sum = 0;
    for (int i = num1; i <= num2; i++) {
      sum += i;
    }
    System.out.printf("sum(%d~%d) = %d\n", num1, num2, sum);
  }

  static int sum2(int num1, int num2) {
    int sum = 0;
    for (int i = num1; i <= num2; i++) {
      sum += i;
    }
    return sum;
  }

  static long sum3(long num1, long num2) {
    long sum = 0;
    for (long i = num1; i <= num2; i++) {
      sum += i;
    }
    return sum;
  }
}

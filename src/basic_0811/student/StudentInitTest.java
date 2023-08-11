package basic_0811.student;

public class StudentInitTest {
  public static void main(String[] args) {
    System.out.println(StaticInit.sumOneToTen);

    StaticInit staticInit = new StaticInit();
    System.out.println(staticInit.SumOneToTen2);
  }
}

class StaticInit {
  static int sumOneToTen;

  static {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    sumOneToTen = sum;
  }

  int SumOneToTen2;
  {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    SumOneToTen2 = sum;
  }
}

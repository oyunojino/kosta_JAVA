package basic_0810;

public class Ex_13_method_5_overloading {
  public static void main(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2, 4));
    System.out.println(sum(1L, 2L, 4L));
  }

  static int sum(int i, int j) {
    return i + j;
  }

  static int sum(int i, int j, int k) {
    return i + j + k;
  }

  static long sum(long i, long j, long k) {
    return i + j + k;
  }

  static long sum(int i, long j) {
    return i + j;
  }
}

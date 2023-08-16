package basic_0816;

public class Ex_06_VarArgs {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    printSum(numbers);
    printSum(1, 2, 3, 4, 5);
    printSum(10, 20, 30);
  }

  //  static void printSum(int n1, int n2, int n3, int n4, int n5) {
//
//  }
  static void printSum(int... numbers) {
    int sum = 0;
    for (int num : numbers) {
      sum += num;
    }
      System.out.println("sum = " + sum);
  }
}

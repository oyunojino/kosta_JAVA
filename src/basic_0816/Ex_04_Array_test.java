package basic_0816;

import java.util.Arrays;

public class Ex_04_Array_test {
  public static void main(String[] args) {
    int[] num = {1, 2, 3, 4};

    System.out.println(Arrays.toString(num));
    increment(num);
    System.out.println(Arrays.toString(num));
  }

  static void increment(int[] num) {
    for (int i = 0; i < num.length; i++) {
      num[i]++;
    }
  }
}

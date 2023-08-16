package basic_0816;

import java.util.Arrays;

public class Ex_07_Array_test {
  public static void main(String[] args) {
    /**
     * Q: sum() 메서드를 하나로 완성하시오.
     * 힌트 => 자바는 가변 길이 변수를 배열처럼 취급
     */
    System.out.println(sum(1, 2, 3, 4));
    int arr[] = {2, 3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1, 2, 3, 4, 5));
  }
  static int sum(int i, int...nums) {
    int sum = 0;
    System.out.println("nums = " + Arrays.toString(nums));
    for (int j = 0; j < nums.length; j++) {
      sum += nums[j];
    }
    return sum;
  }
}

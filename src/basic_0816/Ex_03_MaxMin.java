package basic_0816;

import java.util.Arrays;

public class Ex_03_MaxMin {
  public static void main(String[] args) {
    /**
     * Q: 최대값 최소값 찾기
     * 배열의 첫번쨰 값으로 최대값과 최소값을 초기화함
     * 두번쨰 요소부터 일기 위해 for 반복문의 변수 i
     */

    int[] num = {50, 7, 90, 89, 20};
//    int max = num[0];
//    for (int i = 0; i < num.length; i++) {
//      if(num[i] > max) {
//        max = num[i];
//      }
//    }
//    System.out.println("max = " + max);
    System.out.println("num = " + Arrays.toString(num));
    Arrays.sort(num);
    System.out.println("num = " + Arrays.toString(num));
    System.out.println("num = " + num[num.length-1]);
  }
}

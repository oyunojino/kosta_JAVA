package basic_0814;

import java.util.Scanner;

public class Ex_14_Array_13_Test5 {
  public static void main(String[] args) {
    /**
     * Q5 : 0~99 사이의 정수를 키보드에서 10개 입력받아
     * 10단위 간격의 히스토그램을 출력
     * 입력된 수가 음수이면 무시
     */

    Scanner scanner = new Scanner(System.in);
    int numbers[] = new int[10];
    int num = 0;
    int mok = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("값을 입력해주세요.");
      num = scanner.nextInt();
      if (num >= 0 && num < 100) {
        mok = num / 10;
        numbers[mok]++;
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("%d에서 %d : ", i*10, i*10+9);
      for (int j = 0; j < numbers[i]; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }

  }
}

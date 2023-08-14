package basic_0814;

import java.util.Scanner;

public class Ex_08_Array_4_test {
  //  # 예제
//  표준입력으로 5개의 과목 점수를 입력받아 배열에 저장
//  배열에 들어가 있는 점수의 종합과 평균을 구해라!!!
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] scores = new int[5];
    int sum = 0;
    float avg = 0.0f;

    System.out.println("점수를 5번 입력하시오.");
    for (int i = 0; i < 5; i++) {
      scores[i] = scanner.nextInt();
      sum += scores[i];
    }
//    avg = sum / scores.length;
    avg = sum / (float)scores.length;

    System.out.printf("sum = %d / avg = %.1f", sum, avg);
  }
}

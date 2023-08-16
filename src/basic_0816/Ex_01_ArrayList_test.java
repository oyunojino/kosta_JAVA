package basic_0816;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_01_ArrayList_test {
  //  # 예제(Ex_08_Array_4_test.java 확장)
//  표준입력으로 5개의 과목 점수를 입력받아 배열에 저장
//  학생의 수는 정해지지 않고, -1을 입력받을 때까지 배열에 저장한다.
//  -1이 입력되면, 현재 배열에 들어가 있는 점수의 종합과 평균을 구해라!!!
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<Integer>();
    int sum = 0;
    float avg = 0.0f;
    while (true) {
      System.out.println("점수를 입력해주세요.\n => 종료하려면 -1 입력");
      int num = scanner.nextInt();
      if (num == -1) {
        break;
      }
      scores.add(num);
      sum += num;
    }
    if(scores.size() == 0) {
      avg = 0;
    } else {
      avg = sum / (float) scores.size();
    }
    System.out.println("scores = " + scores);
    System.out.printf("sum = %d / avg = %.1f", sum, avg);
  }
}

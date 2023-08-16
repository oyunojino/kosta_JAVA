package basic_0816.grade;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_09_grade_if_else {
  public static void main(String[] args) {
    int numOfStudents = 0;
    String grade ="";
    Scanner scanner = new Scanner(System.in);

    System.out.println("학생의 명를 입력하세요.");
    numOfStudents = scanner.nextInt();
    int[] scores = new int[numOfStudents];
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("학생의 점수를 입력하세요.");
      scores[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(scores));
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 90) {
        grade = "A";
      } else if (scores[i] >= 80) {
        grade = "B";
      } else {
        grade = "C";
      }
      System.out.printf("%d번째 학생의 점수는 %d, 등급은 %s 입니다.\n",
          i+1, scores[i], grade);
    }
  }
}

package basic_0816;

import java.util.Scanner;

public class Ex_08_test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int student = 0, max = 0, sum = 0, avg = 0;
    int[] scores = new int[]{};

    while (true) {
      System.out.println("------------------------------------------------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("------------------------------------------------------");

      System.out.print("선택>");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("학생수>");
          student = scanner.nextInt();
          scores = new int[student];
          break;
        case 2:
          for (int i = 0; i < student; i++) {
            System.out.print("scores[" + i + "]: ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
            if(max < scores[i]) {
              max= scores[i];
            }
          }
          break;
        case 3:
          for (int i = 0; i < student; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
          }
          break;
        case 4:
          System.out.println("최고 점수: " + max);
          avg = sum/student;
          System.out.println("평균 점수: " + avg);
          break;
        case 5:
          System.out.print("프로그램 종료");
          return;
      }
    }


  }
}

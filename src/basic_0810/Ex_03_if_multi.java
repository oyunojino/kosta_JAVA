package basic_0810;

import java.util.Scanner;

public class Ex_03_if_multi {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해주세요.\n( 범위 => 0~100 )");
    int score = in.nextInt();
    String grade = "";

//    정확하게 하기 위해서 사용하는 방법
//    1. &&문 사용하기
//    2. 큰 수부터 흐르게 만들기
    if (score >= 90 && score < 100 ) {
      if(score >= 95) {
        grade = "A+";
      } else {
        grade = "A0";
      }
    } else if (score >= 80) {
      if(score >= 85) {
        grade = "B+";
      } else {
        grade = "B0";
      }
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }

    System.out.println("당신의 학점은 " + grade);
  }
}

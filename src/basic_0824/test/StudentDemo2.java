package basic_0824.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();

    while (true) {
      int Max = 0;
      System.out.print("점수를 입력하세요. : ");
      int num = sc.nextInt();
      if (num < 0) {
        System.out.println("전체 학생은 " + al.size() + "명이다.");
        System.out.print("학생들의 성적 : ");
        for (int score : al) {
          System.out.print(score + " ");

          if (Max < score) {
            Max = score;
          }
        }
        System.out.println();


        for (int i = 0; i < al.size(); i++) {
          String grade = "";
          if (Max - 10 <= al.get(i) && al.get(i) <= Max) {
            grade = "A";
          } else if (Max - 20 <= al.get(i) && al.get(i) < Max - 10) {
            grade = "B";
          } else {
            grade = "C";
          }
          System.out.println(i + "번 학생의 성적은 " + al.get(i) + "점이며 등급은 " + grade + "이다.");
        }
        break;
      }
      al.add(num);
//      System.out.println(al);

    }
  }
  static void printGrade() {

  }

}

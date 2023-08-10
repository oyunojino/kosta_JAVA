package basic_0810;

import java.util.Scanner;

/**
 * 종료를 입력할 때까지 동물의 이름을 입력받고
 * 입력받은 동물의 종류를 출력한다.
 * [ 조건 ] while문 사용
 */
public class Ex_08_while {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String kind = "";

    while (true) {
      System.out.println("이름을 입력해주세요.");
      String bio = scan.next();

      switch (bio) {
        case "호랑이":
        case "사자":
          kind = "포유류";
          break;
        case "종료":
          return;
        default:
          kind = "해당없음";
          break;
      }
      System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());
    }
  }
}

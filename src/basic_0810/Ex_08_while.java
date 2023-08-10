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
    String bio = "", kind = "";

//    경우 1
//    while (true) {
//      System.out.println("이름을 입력해주세요.\n(프로그램 중단하려면 종료를 작성해주세요)");
//      bio = scan.next();
//
//      switch (bio) {
//        case "호랑이":
//        case "사자":
//          kind = "포유류";
//          break;
//        case "종료":
//          return;
//        default:
//          kind = "해당없음";
//          break;
//      }
//      System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());
//    }

//    경우 2
    while (true) {
      System.out.println("이름을 입력해주세요.\n(프로그램 중단하려면 종료를 작성해주세요)");
      bio = scan.next();

      if (bio.equals("종료")) break;
      switch (bio) {
        case "호랑이", "사자" -> kind = "포유류";
        case "독수리", "참새" -> kind = "조류";
        case "고등어" -> kind = "어류";
        default -> kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());
    }
  }
}

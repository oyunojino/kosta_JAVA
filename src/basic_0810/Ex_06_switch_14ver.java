package basic_0810;

import java.util.Scanner;

public class Ex_06_switch_14ver {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("동물의 이름을 입력해주세요.");
    String bio = scan.next();
    String kind = "";

    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    } else {
      kind = "해당없음";
    }

    System.out.printf("%s는 %s입니다.\n", bio, kind);
// 경우 1
//    switch (bio) {
//      case "호랑이":
//      case "사자":
//        kind = "포유류";
//        break;
//      case "독수리":
//      case "참새":
//        kind = "조류";
//        break;
//      case "고등어":
//        kind = "어류";
//        break;
//      default:
//        kind = "해당없음";
//        break;
//    }
    
//    경우2
    switch (bio) {
      case "호랑이", "사자" -> kind = "포유류";
      case "독수리", "참새" -> kind = "조류";
      case "고등어" -> kind = "어류";
      default -> kind="해당없음";
    }
    System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());
  }

}
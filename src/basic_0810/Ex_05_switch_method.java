package basic_0810;

public class Ex_05_switch_method {
  //  # switch문
//   - (자바 ver.7)부터 문자열과 열거(enum)타입도 사용 가능
//   - break문을 만나기 전까지는 계속 흐르는 성절이 있음

  //  # static
//    객체를 생성하지 않아도 사용 가능함
  public static void main(String[] args) {
    whoIsIt("호랑이");
    whoIsIt("참새");
    whoIsIt("고등어");
    whoIsIt("곰팡이");
  }

  static void whoIsIt(String bio) {
    String kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
        break;
      default:
        kind = "해당없음";
        break;
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);
  }
}

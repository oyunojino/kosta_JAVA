package basic_0810;

public class Ex_04_switch {
  //  # switch문
//   - (자바 ver.7)부터 문자열과 열거(enum)타입도 사용 가능
//   - break문을 만나기 전까지는 계속 흐르는 성절이 있음
  public static void main(String[] args) {
    int number = 3;

    switch (number) {
      case 3:
        System.out.print("*");
      case 2:
        System.out.print("*");
      case 1:
        System.out.print("*");
    }
  }
}

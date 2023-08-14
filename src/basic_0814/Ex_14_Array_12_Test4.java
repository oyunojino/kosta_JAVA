package basic_0814;

import java.util.Scanner;

public class Ex_14_Array_12_Test4 {
  public static void main(String[] args) {
/**
 * Q4 : 키보드에서 URL을 입력받은 후 'com'으로 끝나는지,
 * 'java'를 포함하는지 조사하고 'bye'를 입력하면 종료되는 프로그램 작성
 */
    Scanner scanner = new Scanner(System.in);

    while (true){
      System.out.println("URL을 입력하세요.");
      String url = scanner.next();


      if (url.toLowerCase().endsWith("com")) {
        System.out.println(url + "은 \'com\'으로 끝납니다.");
      }
      if (url.toLowerCase().contains("java")) {
        System.out.println(url + "은 \'java\'를 포함합니다.");
      }
      if (url.toLowerCase().equals("bye")) {
        break;
      }
    }
  }
}

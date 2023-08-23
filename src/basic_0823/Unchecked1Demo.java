package basic_0823;

import java.util.StringTokenizer;

public class Unchecked1Demo {
  public static void main(String[] args) {
    String s = "Time is money";
    StringTokenizer st = new StringTokenizer(s);
    while(st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
//    1회성이기 때문에 NoSuchElementException 객체 생성
    System.out.println(st.nextToken());
  }
}

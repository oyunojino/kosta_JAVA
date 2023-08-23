package basic_0823;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println(st.countTokens()); // 기본 delim => space

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println(st1.countTokens());

//    while(st.hasMoreTokens()) {
//      System.out.println(st.nextToken());
//    }
    while (st1.hasMoreTokens()) {
      System.out.println(st1.nextToken());
    }
  }
}

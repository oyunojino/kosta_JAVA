package basic_0814;

public class Ex_03_String_3 {
  public static void main(String[] args) {
//    # 문자열 조작 메서드


    String s1 = "Hi, Java";
    String s2 = "!!!";

    System.out.println(s1.charAt(4));  // J

    System.out.println(s1 + s2);  // Hi, Java!!!
    System.out.println(s1.concat(s2));  // Hi, Java!!!
//    ---------------------------------------------------------

    String s3 = " ";
    String s4 = "";

    System.out.println("s3.isEmpty() => " + s3.isEmpty());
    System.out.println("s4.isEmpty() => " + s4.isEmpty());
    System.out.println("s3.isBlank() => " + s3.isBlank());
    System.out.println("s4.isBlank() => " + s4.isBlank());

    System.out.println(s1.toLowerCase()); // 전체 소문자
    System.out.println(s1); // 그대로
    System.out.println(s1.toUpperCase()); // 전체 대문자
    System.out.println(s1); // 그대로

    System.out.println(s1.substring(4));
    System.out.println(s1.substring(4, 8));

    System.out.println(s1.length());
  }
}

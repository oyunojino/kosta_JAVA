package basic_0814;

public class Ex_01_String_1 {
  public static void main(String[] args) {
    String s1 = "안녕, 자바"; // 0x100
    String s2 = "안녕, 자바"; // 0x100
    String s3 = new String("안녕, 자바");
    String s4 = new String("안녕, 자바");

    int i1 = 10;
    int i2 = 10;

    System.out.println(i1 == i2); // true
    System.out.println(s1 == s2); // true
    System.out.println(s3 == s4); // false
    System.out.println(s1);

//    # (참조형 데이터 타입)객체 비교 방법
//     -> 리터럴 값은 같지만 주소값은 다름
//     -> 그래서 == / != 사용하지 않음!!!
//    경우 1 ) 주소값 비교
    System.out.println(s1 == s3); // false
//    경우 2 ) 리터럴값 비교
    System.out.println(s1.equals(s2)); // true
  }
}

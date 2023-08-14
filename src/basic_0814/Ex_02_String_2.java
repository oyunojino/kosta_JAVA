package basic_0814;

import basic_0811.Ex_02_uml_test_Car;

public class Ex_02_String_2 {
  public static void main(String[] args) {
//    # 문자열의 비교
//    01. compareTo
//    02. compareToIgnore
//    03. equals
//    04. equalsIgnore

    String s1 = "HI, JAVA";
    String s2 = "Hi, java";

    System.out.println(s1.equals(s2)); // false
    System.out.println(s1.equalsIgnoreCase(s2)); // true
    System.out.println(s1.compareTo(s2));  // -32
    System.out.println(s1.compareToIgnoreCase(s2));  // 0

//    ---------------------------------------------------------

    Ex_02_uml_test_Car car1 = new Ex_02_uml_test_Car();
    Ex_02_uml_test_Car car2 = new Ex_02_uml_test_Car();

    System.out.println(car1 == car2);
    System.out.println(car1.equals(car2));
//    System.out.println(car1.compareTo(car2)); // 따로 구현을 해야 사용가능
  }
}

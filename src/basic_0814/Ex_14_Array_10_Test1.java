package basic_0814;

public class Ex_14_Array_10_Test1 {
  public static void main(String[] args) {
    /**
     * Q1 : 문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다.
     * 문자열 S에 포함된 문자 C의 개수를 반환하도록 하는 메서드 구현
     */
    System.out.println(countChar("hello", 'l'));
//    System.out.println(countChar("JavA", 'A'));
  }

  static int countChar(String s, char c) {
    int result = 0;

    char[] arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
//      arr[i] = s.charAt(i);
//      if(arr[i] == c) {
      if (Character.toUpperCase(c) == s.toUpperCase().charAt(i)) {
        result++;
      }
    }
    return result;
  }
}

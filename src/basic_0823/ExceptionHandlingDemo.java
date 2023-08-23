package basic_0823;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    int i = 0;
    String s = null;
    try {
      s.length();
      int res = 10 / i;
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
//      throw new RuntimeException(e);
    } catch (NullPointerException e) {
      System.out.println("문자열의 내용이 없습니다.");
    } catch (Exception e) {
      // 범위가 큰 예외는 가장 마지막에 위치 시킴
      System.out.println("예외가 발생했습니다.");
    } finally {
      // 에외처리 실행여부와 관계 없이 실행
      System.out.println("프로그램을 종료합니다.");
    }
  }
}

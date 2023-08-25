package basic_0825;

import java.util.function.Predicate;

public class FunctionalInterface2Demo {
  public static void main(String[] args) {
    Predicate<String> isEmptyStr = s -> s.length() == 0;
    System.out.println(isEmptyStr.test(""));
    System.out.println(isEmptyStr.test("notempty"));

    Predicate<Integer> isZero = i -> i == 0;
    System.out.println(isZero.test(0));
    System.out.println(isZero.test(-1));
  }
}

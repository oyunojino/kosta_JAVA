package basic_0828;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {
  //  # Optional 타입이 아님
//  private static double divide(double x, double y) {
//    return x/y;
//  }
  private static OptionalDouble divide(double x, double y) {
    return (y == 0) ? OptionalDouble.empty() : OptionalDouble.of(x / y);
//    return OptionalDouble.of(x/y);
  }

  
//  # 오류
  //  private static OptionalInt divide(Integer x, Integer y) {
  private static OptionalInt divide(int x, int y) {
    return (y == 0) ? OptionalInt.empty() : OptionalInt.of(x / y);
  }

  public static void main(String[] args) {
    OptionalInt divide1 = divide(10, 2);
    System.out.println(divide1);

    OptionalDouble divide = divide(10.0, 2.0);
    System.out.println(divide); // OptionalDouble 타입으로 출력
    System.out.println(divide.getAsDouble()); // 숫자만 출력

    OptionalDouble divideZero = divide(10.0, 0.0);
    System.out.println(divideZero);

    Optional<String> apple = Optional.of("apple");
    System.out.println(apple);
//    # Optional은 자동 언박싱이 안되기 때문에 꺼내와서 사용
    System.out.println(apple.get());

  }
}

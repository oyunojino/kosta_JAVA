package basic_0828;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
//    # 하나라도 "c"로 시작하는게 있는지 여부를 boolean으로 반환
    boolean b = Stream.of("a1", "b1", "c1").anyMatch(x -> x.startsWith("c"));
    System.out.println(b);

    boolean b1 = IntStream.of(1, 3, 5, 7, 9).allMatch(n -> n % 2 == 1);
    System.out.println(b1);

//    스트림 사용 x , 배열 for,if 문으로 전부 홀수인지 판별하는 프로그램 작성
    int nums[] = {1, 3, 5, 7, 9};
    boolean result = true;
    for (int num : nums) {
      if (num % 2 != 1) {
        result = false;
        break;
      }
    }
    System.out.println(result);

    boolean b2 = IntStream.of(1, 3, 5, 7, 9).noneMatch(n -> n % 2 == 0);
    System.out.println(b2);

    System.out.println("---------------------");

//    Q: 모든 나라의 인구가 1억이 넘는가?
    List<Nation> nations = Nation.nations;
    boolean b3 = nations.stream().allMatch(x -> x.getPopulation() > 100.0);
    if(b3) {
      System.out.println("모든 나라의 인구 수는 1억이 넘는다.");
    } else {
      System.out.println("모든 나라의 인구 수가 1억이 넘지 않는다.");
    }
  }
}

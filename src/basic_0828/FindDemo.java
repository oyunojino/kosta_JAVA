package basic_0828;

import java.util.Optional;

public class FindDemo {
  public static void main(String[] args) {
    Optional<Nation> first = Nation.nations.stream().limit(4).findFirst();
    Optional<Nation> second = Nation.nations.stream().skip(1).findFirst();
    System.out.println(first);
    System.out.println(first.get());
    System.out.println(second.get());

//    null일 가능성이 있기 때문에 Optional 타입으로 받음
//    Optional<Nation> any = Nation.nations.stream().filter(x -> x.isIsland()).findAny();
    Optional<Nation> any = Nation.nations.stream().filter(Nation::isIsland).findAny();
    System.out.println(any.get());
  }
}

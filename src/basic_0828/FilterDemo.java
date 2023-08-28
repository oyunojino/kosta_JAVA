package basic_0828;

import java.util.Arrays;

public class FilterDemo {
  public static void main(String[] args) {
    String[] sa = {"a1", "b1", "c1", "c2", "c3"};
    Arrays.stream(sa)
        .filter(s -> s.startsWith("c"))
        .skip(1)
        .forEach(System.out::println);
  }
}

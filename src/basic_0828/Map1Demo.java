package basic_0828;

import java.util.stream.Stream;

public class Map1Demo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
//    출력 방법 1 )
//    Stream<String> stringStream = s1.map(x -> x.toUpperCase());
//    System.out.println(stringStream);
//    출력 방법 2 )
    s1.map(x -> x.toUpperCase())
        .forEach(System.out::println);

    System.out.println("-----------------------------------");

    Stream<Integer> i1 = Stream.of(1, 2, 3, 4, 5);
    i1.map(x -> x * 10)
        .forEach(System.out::println);

    System.out.println("-----------------------------------");

    Stream<String> s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))
        .mapToInt(x -> Integer.parseInt(x))
        .mapToObj(x -> "b" + x)
        .forEach(System.out::println);

    System.out.println("-----------------------------------");

    Stream<String> s3 = Stream.of("a1.0", "a2.0", "a3.0");
    s3.map(s -> s.substring(1))
        .mapToInt(Integer::parseInt)
        .mapToDouble(i -> i * 1.0)
        .mapToObj(i -> "a" + i)
        .forEach(System.out::println);
  }
}

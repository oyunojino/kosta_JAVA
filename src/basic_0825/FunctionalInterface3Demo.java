package basic_0825;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterface3Demo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

//    경우 1 )
    for (Integer i : list) {
      System.out.println(i);
    }
//    경우 2 )
    list.forEach(i -> System.out.println(i));

    System.out.println("------------------------------------");

    list.removeIf(i -> i % 2 == 0);
    list.forEach(i -> System.out.println(i));

    System.out.println("------------------------------------");

    list.add(2);
    list.add(4);
    list.forEach(i -> System.out.println(i));

    System.out.println("------------------------------------");

    list.replaceAll(i -> i * 10);
    list.forEach(i -> System.out.println(i));

    System.out.println("------------------------------------");

    Map<String, Integer> map = new HashMap<>();
    map.put("A", 65);
    map.put("a", 97);

    map.forEach((k, v) -> System.out.println("key : " + k + ", value : " + v));
  }
}

package basic_0824.test;

import java.util.*;

public class HashTableDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new Hashtable<>();

    map.put("김열공", 80);
    map.put("최고봉", 80);
    map.put("우등생", 95);
    map.put("나자바", 88);

    System.out.printf("이름을 입력하세요 : ");
    String name = sc.next();

//    if(name.isBlank()) break;
//    if(map.get(name) > 0) {
//
//    }

    Set<String> keys = map.keySet();
    for(String key : keys) {
      if(key.equals(name)) {
        System.out.println(map.get(key));
      }
    }
  }
}

package basic_0825;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
    System.out.println(fruits);
    System.out.println(fruits.size());

//    # 오류
//      => 팩토리메서드는 불변이기 때문에 수정, 추가 불가!!!
//    fruits.put("키위", 100);
//    fruits.remove("사과");
//    fruits.clear();


    Set<String> keys = fruits.keySet();
    for(String key : keys) {
      System.out.println(key);
    }

    Collection<Integer> values = fruits.values();
    System.out.println(values);
  }
}

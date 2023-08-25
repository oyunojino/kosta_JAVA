package basic_0825;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits =
        Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1, "배", 1);
    Map<String, Integer> hashFruits = new HashMap<>(fruits);

    hashFruits.put("키위", 10);

  }
}

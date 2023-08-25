package basic_0825.test;

import java.util.*;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0; // 최고 점수를 저장하는 변수
    int totalScore = 0; // 점수 합계를 저장하는 변수


    // 코드 작성
    Collection<Integer> values = map.values();
//    maxScore = Collections.max(values);

    for (int value : values) {
      if (maxScore < value) {
        maxScore = value;
        name = String.valueOf(map.get(value));
      }
      totalScore += value;
    }

    Set<String> keys = map.keySet();
    System.out.println(keys);
    for (String key : keys) {
      if (map.get(key) == maxScore){
        name = key;
        break;
      }
    }
    System.out.println("최고 점수를 받은 아이디 : " + name);


    System.out.println("최고 점수 : " + maxScore);
    System.out.println("점수 합계 : "+ totalScore);
    System.out.println("점수 평균 : "+ totalScore/values.size());


    ///////////////////////////////////////////////////////////////////
//    Map.Entry<String, Integer> entry
//    map.entrySet()

    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for(Map.Entry<String, Integer> entry : entries) {
      if(entry.getValue() == maxScore) {
        name = entry.getKey();
        System.out.println();
        break;
      }
    }
  }
}

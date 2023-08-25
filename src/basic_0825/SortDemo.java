package basic_0825;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    List<String> list = Arrays.asList(fruits);

    System.out.println("기존 입력 : " + list);
    Collections.sort(list);
    System.out.println("오름차순 정렬 : " + list);
    
    Collections.sort(list, Collections.reverseOrder());
    System.out.println("내림차순 정렬 : " + list);
  }
}

package basic_0825;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "bbb", "ddd", "aaa");
    System.out.println("정렬전 : " + list);

    Collections.sort(list);
    System.out.println("오름차순 정렬 후 : " + list);

//    Collections.sort(list, new Comparator<String>() {
//      @Override
//      public int compare(String s1, String s2) {
//        return s2.compareTo(s1);
//      }
//    });

    Collections.sort(list, (s1,s2) -> s2.compareTo(s1));
    System.out.println("내림차순 정렬 후 : " + list);
  }

}

//interface Comparator<T> {
//  int compare(T o1, T o2);
//}
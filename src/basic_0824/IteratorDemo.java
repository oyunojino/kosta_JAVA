package basic_0824;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {   // 다음이 있다면
      System.out.print(iterator.next() + " - ");
    }
    System.out.println();

    // Iterator은 일회성이기 때문에 다시 출력하려면 다시 받아와야 함
    while (iterator.hasNext()) {   // 다음이 있다면
      System.out.print(iterator.next() + " - ");
    }
    System.out.println();
  }
}

package basic_0825;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
  public static void main(String[] args) {
    List<Character> list = new ArrayList<>();

    for (char c = 'A'; c <= 'G'; c++) {
      list.add(c);
    }
    System.out.println("기존 리스트 : " + list);

    Collections.rotate(list, 3);
    System.out.println("rotate() : " + list);

    Collections.shuffle(list);
    System.out.println("shuffle() : " + list);
  }
}

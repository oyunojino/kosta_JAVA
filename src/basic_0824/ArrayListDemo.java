package basic_0824;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> cars = List.of("소나타", "아반테", "캐스퍼", "모닝");
    List<String> list = new ArrayList<>(cars);

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ", ");
    }
    System.out.println();

    list.add("토레스");
    for(String car : list){
      System.out.print(car + " : ");
    }
    System.out.println();

    list.add(0, "뉴그렌저");
    System.out.println(list);
    
    
    list.set(4, "제네시스");
    System.out.println(list);

    list.remove(4);
    list.remove(list.get(0));
    list.remove("소나타");
    System.out.println(list);

    System.out.println(list.size());
  }
}

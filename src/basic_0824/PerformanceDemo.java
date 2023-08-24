package basic_0824;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.add(i);
    }
    long end = System.nanoTime();
    long arrayListTime = end - start;
    System.out.println("arrayList 뒤에 값을 추가할 때, " + arrayListTime);

    System.out.println("-------------------------------");

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.add(i);
    }
    end = System.nanoTime();
    long linkedListTime = end - start;
    System.out.println("linkedList 뒤에 값을 추가할 때, " + linkedListTime);

    System.out.println("-------------------------------");

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      arrayList.add(0,i);
    }
    end = System.nanoTime();
    arrayListTime = end - start;
    System.out.println("arrayList 앞에 값을 추가할 때, " + arrayListTime);

    System.out.println("-------------------------------");

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      linkedList.add(0, i);
    }
    end = System.nanoTime();
    linkedListTime = end - start;
    System.out.println("linkedList 앞에 값을 추가할 때, " + linkedListTime);
  }
}

package basic_0824;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
//    # Queue는 인터페이스 이기 때문에 new 사용 X
    Queue<String> q = new LinkedList<>();
    q.add("바나나");
    q.add("사과");
    q.add("배");

    System.out.println(q);
    for (int i = 0; i < 3; i++) {
      System.out.println(q.element());

    }

    while (!q.isEmpty()) {
      System.out.println(q.remove() + "가 삭제되었습니다.");
    }

    System.out.println(q);

    try {
      q.element();
      q.remove();
    } catch (Exception e) {
      System.out.println("큐가 비어있습니다.");
    }
  }
}

package basic_0824;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
  public static void main(String[] args) {
//    # Queue는 인터페이스 이기 때문에 new 사용 X

//    예외처리를 하지 않고 싶다면 아래 매서드 사용
//    add() -> peek()
//    remove() -> poll()
    Queue<String> q = new LinkedList<>();
    q.add("바나나");
    q.add("사과");
    q.add("배");

    System.out.println(q.peek());

    while (!q.isEmpty()) {
      System.out.println(q.poll() + "가 삭제되었습니다.");
    }

    System.out.println(q.peek());
    System.out.println(q.poll());

//    System.out.println("큐가 비어있습니다.");

  }
}

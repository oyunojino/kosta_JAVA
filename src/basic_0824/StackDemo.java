package basic_0824;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.empty());

    stack.push("main");
    stack.push("add");
    stack.push("println");

    stack.iterator();
    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ", ");
    }
    System.out.println();


    System.out.println(stack.size());
//    for (int i = 0; i < stack.size()+2; i++) {
//      System.out.println(stack);
//      stack.pop();
//    }
    while (!stack.empty()) {
      System.out.println(stack);

      System.out.println( stack.pop() + "이 종료되었습니다.");
      if (stack.empty()) {
        System.out.println("프로그램이 종료되었습니다.");
      }
    }

    stack.add("vector");
    stack.add("list");
    System.out.println(stack.peek());
    System.out.println(stack.pop() + "를 삭제했습니다.");
  }
}

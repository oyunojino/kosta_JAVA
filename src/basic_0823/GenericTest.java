package basic_0823;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    // 지정하지 않으면 Object로 지정됨
    ArrayList nums = new ArrayList();
    nums.add(10); // Integer로 10이 auto-boxing
    nums.add(3.14); // Double로 3.14가 auto-boxing
    nums.add("hello");

    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) instanceof Integer) {
        System.out.println((Integer) (nums.get(i)) * 2);
      }
      else if (nums.get(i) instanceof Double) {
        System.out.println((Double
            ) (nums.get(i)) * 2);
      }
    }
  }
}

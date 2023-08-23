package basic_0823;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
//    ### 제네릭의 데이터타입 x

    // 지정하지 않으면 Object로 지정됨
//    ArrayList nums = new ArrayList();
//    nums.add(10); // Integer로 10이 auto-boxing
//    nums.add(3.14); // Double로 3.14가 auto-boxing
//    nums.add("hello");
//    nums.add(30);
//
//    for (int i = 0; i < nums.size(); i++) {
//      if (nums.get(i) instanceof Integer) {
//        System.out.println((Integer) (nums.get(i)) * 2);
//      } else if (nums.get(i) instanceof Double) {
//        System.out.println((Double) (nums.get(i)) * 2);
//      } else if (nums.get(i) instanceof String) {
//        System.out.println(Integer.parseInt((String) nums.get(i)));
//      }
//    }


//    ### 제네릭의 데이터타입 o
//    => 타입의 안정성을 보장
    int num = 30;
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(num);

    for (int i = 0; i < nums.size(); i++) {
      System.out.println((nums.get(i)) * 2);
    }

    String s = "world";
    ArrayList<String> strs = new ArrayList<>();
    strs.add("hello");
    strs.add(s);
    strs.add("");
    strs.add(null);

    for (int i = 0; i < strs.size(); i++) {
      String getStr = strs.get(i);
      if(getStr != null) {
        System.out.println(getStr.length());
      } else {
        System.out.println("아무것도 없습니다.");
      }
    }

  }
}

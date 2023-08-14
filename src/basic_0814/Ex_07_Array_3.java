package basic_0814;

import java.util.Arrays;

public class Ex_07_Array_3 {
  public static void main(String[] args) {
    int num[] = {1, 2, 3, 4, 5};


//    # 원소를 하나씩 출력
    for (int arr : num) {
      System.out.println(arr);
    }

//    # 전체 배열을 출력
//    경우 1 )
//     => toString이 구현되어있지 않기 때문에 배열의 주소가 출력됨
//    [I@776ec8df => [(배열) I(int형) 776ec8df(주소)
    System.out.println(num); // [I@776ec8df

//    경우 2 )
    System.out.println(Arrays.toString(num)); //[1, 2, 3, 4 ,5]

//    -------------------------------------------------------------

    char[] cArr = {'a', 'b', 'c'};
    for (char c : cArr) {
      System.out.println(c);
    }
//    문자의 배열 = 문자열이기 때문에 출력 O
    System.out.println(cArr); // abc
    System.out.println(Arrays.toString(cArr)); // [a, b, c]

  }
}

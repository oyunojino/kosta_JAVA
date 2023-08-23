package basic_0822;

import java.util.Date;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[1000];
    System.out.println(System.nanoTime());

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    System.out.println(System.nanoTime());

    System.out.println("---------------------------");
//        기준 ) 1970년 1월 1일 0시
    System.out.println(System.currentTimeMillis());
//        long 타입의 숫자를 날짜로 변환
    System.out.println(new Date(1692751568736l));
  }
}

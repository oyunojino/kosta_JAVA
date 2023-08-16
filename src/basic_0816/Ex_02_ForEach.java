package basic_0816;

import java.util.Arrays;

public class Ex_02_ForEach {
  public static void main(String[] args) {
    int[] one2five = {0, 1, 2, 3, 4};
    int sum = 0;

    System.out.println(Arrays.toString(one2five));
    for (int i = 0; i < one2five.length; i++) {
//      one2five[i] += 1;
      one2five[i]++;
    }
    System.out.println(Arrays.toString(one2five));

    for (int i : one2five) {
//      System.out.println("i = " + i);
//      i++;
      sum += i;
      System.out.println("sum = " + sum);
    }


  }
}

package basic_0814;

import java.util.Arrays;

public class Ex_10_Array_6_multi {
  public static void main(String[] args) {
    int scores[][];

    scores = new int[][]{
        {100, 90, 80, 70, 60},
        {100, 70, 80, 90, 100},
        {90, 90, 90, 90, 90}
    };
    int sum[] = new int[3];
    int total = 0;

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        sum[i] += scores[i][j];
      }
      total += sum[i];
    }
    System.out.println(Arrays.toString(sum));
    System.out.println(total);
  }
}

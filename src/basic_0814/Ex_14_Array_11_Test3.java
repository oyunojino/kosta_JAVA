package basic_0814;

public class Ex_14_Array_11_Test3 {
  public static void main(String[] args) {
    /**
     * Q3 : 3년간 분기별 이자율에 대한 연평균 이자율과 평균 이자율을 출력하는 예제
     *  for ~ each문으로 변경
     */
    double[][] interests = {
        {3.2, 3.1, 3.2, 3.0},
        {2.9, 2.8, 2.7, 2.6},
        {2.7, 2.6, 2.5, 2.7}
    };
    double[] sum1 = {0.0, 0.0, 0.0};
    double sum2 = 0.0;

    System.out.println("for ~ each문 변경 전");
    for (int i = 0; i < interests.length; i++) {
      for (int j = 0; j < interests[i].length; j++) {
        sum1[i] += interests[i][j];
      }
      System.out.printf("%d차 년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
      sum2 += sum1[i];
    }

    System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length, sum2 / 3);

//    -------------------------------------------------------------------
//    for ~ each문
//    -------------------------------------------------------------------
    System.out.println("for ~ each문 변경 후");
    int i = 0;
    for (double[] interest : interests) {
      for (double interestEach : interest) {
        sum1[i++] += interestEach;
      }
      System.out.printf("%d차 년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / interest.length);
      sum2 += sum1[i++];
    }
    System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length, sum2 / sum1.length);
  }
}

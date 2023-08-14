package basic_0814;

public class Ex_05_Array_1 {
//  # 배열
//  동일한 타입, 동일한 이름인 연속적인 구별하는 것
//  0번째 주소, 데이터 타입,

  public static void main(String[] args) {
//    지역변수는 초기화 해줘야함
    int sum = 0, avg = 0;

    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum / 3;

//    int[] scores = new int[3]; // 선언 시 0으로 초기화됨
//    scores[0] = 90;
//    scores[1] = 80;
//    scores[2] = 100;
    int[] scores = {100, 80, 100, 100, 90};
    int[] scores2 = new int[]{100, 80, 100, 100, 90};
    int[] scores3;
    scores3 = new int[]{100, 80, 100, 100, 90};


    sum = 0;
    avg = 0;
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.println("sum = " + sum);
    System.out.println("avg = " + avg);

  }
}

package basic_0814;

public class Ex_06_Array_2 {
  public static void main(String[] args) {
//    # 배열의 크기를 동적으로 추가하는 법
    int[] scores = {100, 80, 100, 100, 90};

    int[] scoresBig = new int[6];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
    scores = scoresBig;
    scores[3] = 110;
//    # for문
    System.out.println("# for문");
    for (int i = 0; i<scores.length;i++) {
      System.out.println(scores[i]);
    }

//    # for each문
    System.out.println("# for each문");
    for(int score : scores) {
      System.out.println(score);
    }
  }
}

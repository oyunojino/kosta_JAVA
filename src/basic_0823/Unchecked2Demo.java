package basic_0823;

public class Unchecked2Demo {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};

    // 배열의 범위를 넘었기 때문에 ArrayIndexOutOfBoundsException 객체 생성 
    System.out.println(array[3]);
  }
}

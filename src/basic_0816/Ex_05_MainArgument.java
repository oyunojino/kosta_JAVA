package basic_0816;

import java.util.Arrays;

public class Ex_05_MainArgument {
  public static void main(String[] args) {
    /**
     * Q: 인자가 2개 들어와야 하며,
     * 2번쨰 인자로 입력된 숫자만큼 첫번째 인자로 입력된 문자를 출력
     *
     * 안녕 3 => 안녕\n 안녕\n 안녕\n
     * 주의 1 => args 문자열 배열이므로 모든 인자는 문자이다.
     *          그러므로, 2번째 인자를 숫자로 변환
     * 주의 2 => args 2개가 입력되었을 때만, 실행, 1개의 인자만 입력되면 출력 x
     */
    System.out.println("Arrays.toString(args) = " + Arrays.toString(args));

    if (args.length == 2) {
      printArgument(args[0], Integer.parseInt(args[1]));
    } else {
      System.out.println("값이 비어있습니다.");
    }

  }

  static void printArgument(String arg, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(arg);
    }
  }
}

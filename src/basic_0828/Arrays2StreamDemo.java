package basic_0828;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Arrays2StreamDemo {
  public static void main(String[] args) {
    int[] ia = {1, 2, 3, 4, 5};
    IntStream stream = Arrays.stream(ia);

    String[] sa = {"a", "b", "c", "d", "e"};
    Stream<String> sal = Stream.of(sa);

    double[] da = {1.2, 3.14, 5.2};
    DoubleStream ds = DoubleStream.of(da);
  }
}

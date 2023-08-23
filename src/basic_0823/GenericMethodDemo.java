package basic_0823;

public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] ia = {1, 2, 3, 4, 5};
    Character[] ca = {'a', 'b', 'c', 'd', 'e'};

    Utils.showArray(ia); // [1,2,3,4,5]
    Utils.showArray(ca); // ['a', 'b', 'c', 'd', 'e']

    Utils.getLast(ia); // 5
    System.out.println(Utils.getLast(ia));
    Utils.getLast(ca); // e
    System.out.println(Utils.getLast(ca));
  }
}

class Utils {
  static <T> void showArray(T[] array) {
//    System.out.println(Arrays.toString(array));
    for (T t : array) {
      System.out.printf("%s ", t);
    }
    System.out.println();
  }

  static <T> T getLast(T[] array) {
    return array[array.length - 1];
  }
}

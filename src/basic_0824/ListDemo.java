package basic_0824;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals1 = {"사슴", "호랑이", "바다표범", "곰"};
    List<String> animals2 = Arrays.asList(animals1);

    System.out.println(Arrays.toString(animals1));
    System.out.println(animals2);

    System.out.println("-------------------------");

    animals2.set(3, "앵무새");
    Iterator<String> iterator = animals2.iterator();
    while (iterator.hasNext()) {
      System.out.printf(iterator.next() + ", ");
    }
    System.out.println();

    System.out.println("-------------------------");

//    # abstractList 라 사용 불가
//    animals2.add(0, "바다표범");
    String[] animalArray = animals2.toArray(new String[0]);
    System.out.println(Arrays.toString(animalArray));

    for(String ani : animals2) {
      System.out.print(ani + ", ");
    }
    System.out.println();

    System.out.println("-------------------------");

    animals2.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
//        TO DO...
        return o1.length() - o2.length();
      }
    });
    System.out.println(animals2);
  }
}

package basic_0816;

import java.util.ArrayList;

public class Ex_01_ArrayList_1 {
  public static void main(String[] args) {
//  ArrayList<E>
//    <E>
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println(numbers);
    numbers.add(20);
    System.out.println(numbers);
    numbers.add(30);
    System.out.println(numbers);
    numbers.add(0, 11);
    System.out.println(numbers);
    System.out.println("numbers.size() = " + numbers.size());

    numbers.remove(1);
    System.out.println("numbers = " + numbers);
    System.out.println("numbers.get(2) = " + numbers.get(1));
  }
}

package basic_0814;

public class Ex_09_Array_5_String {
  public static void main(String[] args) {
    String[] names = new String[3];
    for (String name : names) {
      System.out.println(name); // null
    }

    names = new String[]{"Kim", "Lee", "Park"};
    for (String name : names) {
      System.out.println(name);
    }
  }
}

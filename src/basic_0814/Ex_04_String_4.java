package basic_0814;

public class Ex_04_String_4 {
  public static void main(String[] args) {
    String java = String.format("%s %.1f", "JAVA", 3.14);
    System.out.println(java);

    String join = String.join(",", "apple", "grape");
    System.out.println(join);

    String s = String.valueOf(3);
    System.out.println(s);
  }
}

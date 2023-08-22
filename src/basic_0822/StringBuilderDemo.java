package basic_0822;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi"); // 즉, String 객체는 불변
        System.out.println(s);
        System.out.println(s.hashCode()); // hi -> 주소값 100
        s = s + "!";
        System.out.println(s.hashCode()); // hi! -> 주소값 200

        System.out.println("---------------------------------");

        StringBuilder sb = new StringBuilder("hi"); // 즉, StringBuilder 객체는 변경 O
        System.out.println(sb.hashCode()); // hi -> 주소값 100
        sb = sb.append("!");
        System.out.println(sb.hashCode()); // hi! -> 주소값 100
    }
}

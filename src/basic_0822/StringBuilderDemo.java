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

        System.out.println("---------------------------------");

        System.out.println("문자열의 길이 : " + sb.capacity());
        sb = sb.delete(7, 12);
        System.out.println("world 삭제 후 " + sb);
        sb = sb.insert(7, "world");
        System.out.println("world를 7번째 자리에 추가 후 : " + sb);
        sb = sb.replace(7, 12, "JAVA");
        System.out.println("world를 JAVA로 변경 후 : " + sb);

        sb = sb.replace(0, 6, "HELLO,").reverse();
        System.out.println("hello를 HELLO로 변경 후 리버스 : " + sb);
    }
}

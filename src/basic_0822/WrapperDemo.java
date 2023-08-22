package basic_0822;

public class WrapperDemo {
    public static void main(String[] args) {
//        # ver.9부터 new Integer() 삭제됨
//        Integer bi = new Integer(10);

        Integer bi = Integer.valueOf(10);
        System.out.println(bi);
        bi = 20;
        System.out.println(bi);
        float f = Float.parseFloat("3.14");
        System.out.println(f);
//        int i = Integer.parseInt("3.14"); // 데이터형이 달라서 오류
        int i = Integer.parseInt("3");
        System.out.println(i);
    }
}

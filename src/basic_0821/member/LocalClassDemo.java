package basic_0821.member;

public class LocalClassDemo {
    //    맴버 -> 필드
    private String s1 = "외부";

    //    맴버 -> 메서드
    void method1() {
//        지역변수 -> 필드
        int x = 1;
//        지역클래스
        class LocalClass {
            //            맴버 -> 필드
            String s2 = "내부";

            //            맴버 -> 메서드
            public void show() {
                System.out.println("지역 클래스");
            }
        }
        LocalClass lc = new LocalClass();
        System.out.println(lc.s2);
        lc.show();
    }

    //    맴버 - static 메서드
    public static void main(String[] args) {
        LocalClassDemo lcd = new LocalClassDemo();
        lcd.method1();
    }
}

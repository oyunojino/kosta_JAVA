package basic_0821.member;

public class MemberClassDemo {
    //    맴버 - 필드
    private String secret = "비공개";
    String s = "외부";

    //    맴버 - 클래스
    class MemberClass {
        //     맴버 - 필드
        String s = "내부";

        //     맴버 - 메서드
        public void show1() {
            System.out.println("inner class");
            System.out.println(secret);
            System.out.println(s);
            System.out.println("-----------------------");
            System.out.println(MemberClassDemo.this.s);
        }
    }


    //    맴버 - 메서드
    public static void main(String[] args) {
        MemberClassDemo m = new MemberClassDemo();
        System.out.println(m.s);
        System.out.println(m.secret);
        System.out.println("-----------------------");

        MemberClassDemo.MemberClass mm = m.new MemberClass();
        System.out.println(mm.s);
        mm.show1();
    }
}

package basic_0818;

public class MemberTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Member user1 = new Member("홍길동", "hong");
        Member m1 = new Member("홍길동", "hong", "12345", 20);
        Member m2 = new Member("김연아", "kim", "qwert", 20);

        boolean result = memberService.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 혹은 password가 올바르지 않습니다.");
        }
        result = memberService.login("error", "12345");

    }
}

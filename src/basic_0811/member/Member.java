package basic_0811.member;

/**
 * Q: 회원을 모델링한 Member 클래스 생성
 * 회원 정보 -> 이름(변경 o), 아이디(변경 o), 암호, 나이(0~120)
 * 외부 객체 -> 회원정보에 직접 접근 x / 접근자,설정자로만 접근
 */
public class Member {
  private String name;
  private String id;
  private String pw;
  private Integer age;

  //  생성자
  public Member(String name, String id, String pw, Integer age) {
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  //  접근자
  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPw() {
    return pw;
  }

  public Integer getAge() {
    return age;
  }

  //  설정자
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    if (age < 0 || age > 120) {
      System.out.println("나이 범위는 0부터 120까지입니다.");
    } else {
      this.age = age;
    }
  }

//  public void print() {
//    System.out.printf("이름 : %s\n아이디 : %s\n비밀번호 : %s\n나이 : %d");
//  }
}

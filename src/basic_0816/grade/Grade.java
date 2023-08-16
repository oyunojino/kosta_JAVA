package basic_0816.grade;

public enum Grade {
  A("EXCELLENT"), B("GOOD"), C("SOSO");
//  필드
  private String grade;
//  생성자
  Grade() {
  }
//  메서드
  private Grade(String grade) {
    this.grade = grade;
  }

  public String getGrade() {
    return grade;
  }
}

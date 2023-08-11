package basic_0811;

public class Ex_03_uml_test_Course {
  private String id;
  private String name;
  private Integer numOfStudents;

  //  getter는 무조건 생성
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getNumOfStudents() {
    return numOfStudents;
  }


// setter는 비즈니스 로직으로 변경하기 떄문에 때에 따라 생성
  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student) {
    numOfStudents += student;
  }

  public void deleteStudent(int student) {
    numOfStudents -= student;
  }
}

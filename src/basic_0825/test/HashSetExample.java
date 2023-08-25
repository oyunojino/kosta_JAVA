package basic_0825.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<Student>();

    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "신용권"));
    set.add(new Student(1, "조민우"));

    System.out.println("저장된 객체 수 : "+ set.size());
    for(Student s : set) {
      System.out.println(s.studentNum + " : " + s.name);
    }
  }
}

class Student {
  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  // 코드 작성


  @Override
  public int hashCode() {
    return studentNum;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj != null && obj instanceof Student student) {
      if(student.studentNum == this.studentNum) {
        return true;
      }
    }
    return false;
  }
}

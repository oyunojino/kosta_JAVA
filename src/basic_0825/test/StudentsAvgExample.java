package basic_0825.test;

public class StudentsAvgExample {

  private static StudentEx[] students = {
      new StudentEx("홍길동", 90, 96),
      new StudentEx("신용권", 95, 93)
  };

  // avg() 메소드
  private static double avg(Function<StudentEx> fun) {
    double sum =0.0;
    for(StudentEx student : students) {
      sum += fun.apply(student);
    }
    return sum/students.length;
  }


  public static void main(String[] args) {
    double englishAvg = avg(s -> s.getEnglishScore());
    System.out.println("영어 평균 점수: " + englishAvg);
    double mathAvg = avg(s -> s.getMathScore());
    System.out.println("수학 평균 점수: " + mathAvg);
  }


}

@FunctionalInterface
interface Function<T> {
  public double apply(T t);
}

class StudentEx {
  private String name;
  private int englishScore;
  private int mathScore;

  public StudentEx(String name, int englishScore, int mathScore) {
    this.name = name;
    this.englishScore = englishScore;

    this.mathScore = mathScore;
  }

  public String getName() {
    return name;
  }

  public int getEnglishScore() {
    return englishScore;
  }

  public int getMathScore() {
    return mathScore;
  }
}
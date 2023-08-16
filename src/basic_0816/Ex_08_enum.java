package basic_0816;

public class Ex_08_enum {
  public static void main(String[] args) {
//    int gender = People.MALE;
//    if (gender == 0) System.out.println("남성입니다.");
//    if (People.EAST == 0) System.out.println("남성입니다.");
//
//    int gender1 = People1.FEMALE;
//    if (gender1 == 1) System.out.println("여성입니다.");
//    if (People.WEST == 1) System.out.println("여성입니다.");
    People people = new People();
    people.age = 20;
    people.gender = Gender.MALE;
    people.direction = Direction.EAST;
    if (people.gender == Gender.MALE) System.out.println("남성입니다.");
    if (people.direction == Direction.EAST) System.out.println("남성입니다.");


    People people1 = new People();
    people1.age = 50;
    people1.gender = Gender.FEMALE;
    people1.direction = Direction.WEST;
    if (people1.gender == Gender.FEMALE) System.out.println("여성입니다.");
    if (people1.direction == Direction.WEST) System.out.println("여성입니다.");
  }
}

class People {
  int age;

  Gender gender;
//  static final int MALE = 0;
//  static final int FEMALE = 1;

  Direction direction;
  //  static final int EAST = 0;
//  static final int WEST = 1;
//  static final int SOUTH = 3;
//  static final int NORTH = 4;
}

class People1 {
  static final int MALE = 0;
  static final int FEMALE = 1;

  static final int EAST = 0;
  static final int WEST = 1;
  static final int SOUTH = 3;
  static final int NORTH = 4;
}
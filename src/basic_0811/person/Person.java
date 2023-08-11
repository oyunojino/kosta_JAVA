package basic_0811.person;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }


  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public Person seyHello() {
    System.out.println(age + "살 " + name + "입니다.");
    return this;
  }
}

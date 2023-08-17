package basic_0817.test;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = {
          new Person("길동이", 22),
          new Student("황진이", 23, 100),
          new ForeignStudent("Amy", 30, 200, "U.S.A")
        };

        for(Person person : persons) {
            person.show();
        }

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show() {
        System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
    }

}

class Student extends Person {
    private int hakbun;

    public Student(String name, int age, int hakbun) {
        super(name, age);
        this.hakbun = hakbun;
    }

    public int getHakbun() {
        return hakbun;
    }

    void show() {
        System.out.println("사람[이름 : " + super.getName() + ", 나이 : " + super.getAge() + ", 학번 : " + hakbun + "]");
    }
}

class ForeignStudent extends Student {
String nation;

    public ForeignStudent(String name, int age, int hakbun, String nation) {
        super(name, age, hakbun);
        this.nation = nation;
    }
    void show() {
        System.out.println("사람[이름 : " + super.getName() + ", 나이 : " + super.getAge() + ", 학번 : " + super.getHakbun() +", 국적 : "+nation +"]");
    }
}

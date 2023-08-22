package basic_0822;

public class HumanTest {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Human p = new Worker();
        p.print();
        p.eat();
    }
}

interface Human {
//    # @Override 하지 않기 위해서 static을 붙여줌
    static void echo() {
        System.out.println("야호!!!");
    }

    void eat();

//    # interface에 추가 할 때, 오류 안 나도록 넣는 방법
    default void print() {
//        기본값을 지정
        System.out.println("인간입니다.");
    }
}

class Worker implements Human {
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
}

class Student implements Human {
    int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println(age + "세의 학생입니다.");
    }
    
}

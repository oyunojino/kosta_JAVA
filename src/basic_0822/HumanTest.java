package basic_0822;

public class HumanTest {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student();
        s.print();
        s.eat();

        Human p = new Worker();
        p.print();
        p.eat();
    }
}

interface Human {
    static void echo() {
        System.out.println("야호!!!");
    }

    void eat();
    void print();
}

class Worker implements Human {
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println("인간입니다.");
    }
}

class Student implements Human {
    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }
    @Override
    public void print() {
        System.out.println("20세의 학생입니다.");
    }
}

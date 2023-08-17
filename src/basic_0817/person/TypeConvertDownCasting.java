package basic_0817.person;

public class TypeConvertDownCasting {
    public static void main(String[] args) {
//        exception발생하기 때문에 사용 x
//        Student s = (Student) new Person();
//        s.whoAmI();
//        s.work();

        Student s = new Student();
        Person p = new Person();
        Worker w = new Worker();

        System.out.println("s instanceof Student => " + (s instanceof Student));
        System.out.println("s instanceof Person => " + (s instanceof Person));
        System.out.println("p instanceof Student => " + (p instanceof Student));
//        System.out.println("s instanceof String => " + (s instanceof String));  // 오류
        System.out.println("p instanceof Object => " + (p instanceof Object));

        downCast(p);
        System.out.println("---------------");
        downCast(s);
        downCast(w);
//        downCast("hello");
        downCast(new Person());
    }

    static void downCast(Person p) {
        p.whoAmI();
        if (p instanceof Student) {
            Student s = (Student) p;
            s.work();
        } else if (p instanceof Worker) {
//            ((Worker) p).work();
            Worker w = (Worker) p;
            w.work();
        } else {
            
        }
    }

//    static void downCast(Student p) {
//
//    }
//
//    static void downCast(Worker p) {
//
//    }
}

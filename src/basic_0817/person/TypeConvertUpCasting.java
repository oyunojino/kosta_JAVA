package basic_0817.person;

public class TypeConvertUpCasting {
//    Upcasting 설명
    public static void main(String[] args) {
//        Person p = new Person();
//        Student s = new Student();
//        String name = s.name;
//        int number = s.number;
//        s.work();
//        s.whoAmI();
//
//        name = p.name;
//        p.whoAmI();

        Person p;
        Student s = new Student();
        Worker w = new Worker();
        p = s;
        String name = p.name;
        p.whoAmI();

        p = w;
        p.whoAmI();
        String s1;
//        s1 = w;

        Object o = new Person();
        o = s;
        o = p;

        Person p1 = new Student();
        Person p2 = new Worker();

    }
}

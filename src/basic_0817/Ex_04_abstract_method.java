package basic_0817;

public class Ex_04_abstract_method {
    public static void main(String[] args) {
//        # new로 생성 불가능
//        AbstrctClass abstrctClass = new AbstrctClass();
    }
}

abstract class AbstrctClass {
    double PI = 3.14;

    abstract void absMethod();
}
class ComClass extends AbstrctClass {
    @Override
    void absMethod() {
        System.out.println("추상 메서드");
    }
}
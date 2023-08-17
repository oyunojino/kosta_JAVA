package basic_0817;

public class Ex_interfaceTest {
    public static void main(String[] args) {
        C1 c1 = new C1();
//       전체를 다 바꿀 수 없을 때 사용함
        c1.defaultMethod();

        C2 c2 = new C2();
        c2.method1();
        c2.method2();
    }
}

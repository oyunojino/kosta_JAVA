package basic_0821.member;

public class AnonymousDemo {
    public static void main(String[] args) {
//        # 익명클래스(Anonymous class)
//        클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
        Parent P = new Parent() {
//            ## Parent가 인터페이스 일 때,
//            @Override
//            public void parent() {
//                System.out.println("익명클래스에서 구현한 메서드");
//            }
        };


    }
}

// ## Parent가 인터페이스 일 때,
//class OnlyOnce implements Parent {
//    @Override
//    public void parent() {
//        System.out.println("parent");
//    }
//}
// ## Parent가 인터페이스 일 때,
//interface Parent {
//    void parent();
//}


// ### Parent가 클래스 일 때,
class Parent {
    void parent() {
        System.out.println("parent");
    }
}
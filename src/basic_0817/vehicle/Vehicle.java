package basic_0817.vehicle;

public class Vehicle {
    String name = "탈 것";
    
    void whoAmI() {
        System.out.println("나는 탈 것 입니다.");
    }
    static void move() {
        System.out.println("이동하다.");
    }
}
class Car extends Vehicle {
    String name = "자동차";

    void whoAmI() {
        System.out.println("나는 자동차 입니다.");
    }
    static void move() {
        System.out.println("달린다.");
    }
}

class SportsCar extends Car {
    void whoAmI() {
        System.out.println("나는 스포츠카 입니다.");
    }
}


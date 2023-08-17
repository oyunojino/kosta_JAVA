package basic_0817.test;

public class Vehicle {
    String color; // 자동차 색상
    int speed; // 자동차 속도

    void show() {
        System.out.println("운송 수단");
    }

    public Vehicle(String color, int speed) {
        this.color = this.color;
        this.speed = this.speed;
    }
}

class Car extends Vehicle {
    int displacement; // 자동차 배기량
    int gears; // 자동차 기어 단 수

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    void show() {
        System.out.println("자동차");
        System.out.println("<------ Car ------->");
        System.out.println("color = " + color);
        System.out.println("speed = " + speed);
        System.out.println("displacement = " + displacement);
        System.out.println("gears = " + gears);
        System.out.println("<------------------>");
    }
}

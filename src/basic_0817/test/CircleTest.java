package basic_0817.test;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(3),
                new ColoredCircle(3, "white")
        };

        for(Circle circle : circles) {
            circle.show();
        }
    }

}

class Circle {
    int radius;

    void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}

class ColoredCircle extends Circle {
    String color;

    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }
}

package basic_0821.move;

public class MoveableDemo {
    public static void main(String[] args) {

        Moveable m = new Car();
        m.move(5);
//        # 부모에서는 자동형변환이 되었어도 자식꺼는 사용 못함

        Car c = (Car) m;
        c.move(10);
        c.show();

    }
}

interface Moveable {
    void move(int x);
}

class Car implements Moveable {
    private int pos = 0;

    @Override
    public void move(int x) {
        pos += x;
    }

    public void show() {
        System.out.println(pos + "m 이동했습니다.");
    }
}
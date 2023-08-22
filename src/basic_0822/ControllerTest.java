package basic_0822;

public class ControllerTest {
    public static void main(String[] args) {
        Controller[] c = {
                new TV2(false),
                new Radio2(true)
        };


        for (Controller controller : c) {
            controller.show();
        }
    }
}

abstract class Controller {
    boolean power;

    public Controller(boolean power) {
        this.power = power;
    }

    void show() {
        if (power) {
            System.out.println(this.getName() + "가 켜졌습니다.");
        } else {
            System.out.println(this.getName() + "가 꺼졌습니다.");
        }
    }

    abstract String getName();
}

class TV2 extends Controller {
    public TV2(boolean power) {
        super(power);
    }

    @Override
    public String getName() {
        return "TV";
    }

}

class Radio2 extends Controller {
    public Radio2(boolean power) {
        super(power);
    }

    @Override
    public String getName() {
        return "Radio";
    }

}

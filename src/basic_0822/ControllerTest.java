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

    void show() {
        System.out.println(getName() + "가 꺼졌습니다.");
    }

    abstract String getName();
}

class TV2 extends Controller {
    @Override
    public String getName() {
        return "TV";
    }

    public TV2(boolean result) {

    }
}

class Radio2 extends Controller {
    @Override
    public String getName() {
        return "Radio";
    }

    public Radio2(boolean result) {

    }
}

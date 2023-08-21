package basic_0821.member;

public class InnerInterfaceDemo implements Icon.Touchable {
    @Override
    public void touch() {
        System.out.println("아이콘을 터치한다.");
    }

    public static void main(String[] args) {
        Icon.Touchable it = new InnerInterfaceDemo();
        it.touch();
    }
}

class Icon {
    interface Touchable {
        void touch();
    }
}
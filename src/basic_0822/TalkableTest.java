package basic_0822;

public class TalkableTest {
//
    static void speak1(Object obj) {
        if(obj instanceof Korean) {
            ((Korean) obj).talk();
        } else if(obj instanceof American) {
            ((American)obj).talk();
        }
    }
//
    static void speak2(Talkable talkable) {
        talkable.talk();
    }

    public static void main(String[] args) {
        speak2(new Korean());
        speak2(new American());
    }
}
interface Talkable {
    void talk();
}
class Korean implements Talkable {
    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}
class American implements Talkable {
    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}
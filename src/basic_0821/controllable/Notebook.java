package basic_0821.controllable;

public class Notebook extends Computer implements Portable{

    @Override
    public void inMyBag() {
        System.out.println("노트북이 내 가방 안에 있다.");
    }

    @Override
    public void turnOn() {
        System.out.println("노트북을 켠다.");
    }
}

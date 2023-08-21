package basic_0821.controllable;

public class ControllableDemo {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.turnOff();
        tv1.repair();
//        # static 메서드 사용법
//        tv1.reset(); => 오류
        Controllable.reset();
        System.out.println("------------------------");


        TV tv2 = new TV();
        tv2.turnOn();
        tv2.turnOff();
        System.out.println("------------------------");


        Computer com1 = new Computer();
        com1.turnOn();
        com1.turnOff();
        com1.repair();
//        # static 메서드 사용법
//        com1.reset(); => 오류
        Controllable.reset();
        System.out.println("------------------------");


        Notebook notebook = new Notebook();
        notebook.turnOn();
        notebook.turnOff();
        notebook.inMyBag();
        System.out.println("------------------------");

    }
}

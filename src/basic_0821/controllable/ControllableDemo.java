package basic_0821.controllable;

public class ControllableDemo {
    public static void main(String[] args) {
//        경우 1 ) 하나하나 작성하는 방법
//        TV tv1 = new TV();
//        tv1.turnOn();
//        tv1.turnOff();
//        tv1.repair();
////        # static 메서드 사용법
////        tv1.reset(); => 오류
//        Controllable.reset();
//        System.out.println("------------------------");
//
//
//        TV tv2 = new TV();
//        tv2.turnOn();
//        tv2.turnOff();
//        System.out.println("------------------------");
//
//
//        Computer com1 = new Computer();
//        com1.turnOn();
//        com1.turnOff();
//        com1.repair();
////        # static 메서드 사용법
////        com1.reset(); => 오류
//        Controllable.reset();
//        System.out.println("------------------------");
//
//
//        Notebook notebook = new Notebook();
//        notebook.turnOn();
//        notebook.turnOff();
//        notebook.inMyBag();
//        System.out.println("------------------------");


//        경우 2 ) 하나로 묶어서 작성하는 방법
        Controllable[] controllables = {
//                new Controllable(), =>  불가능
            new TV(),
            new Computer(),
            new Notebook()
        };

//        controllables[0].turnOn();
//        controllables[1].turnOn();
//        controllables[2].turnOn();

        for (Controllable controlable : controllables) {
//            각 클래스에서 받아와서 실행
            controlable.turnOn();
            controlable.turnOff();
            controlable.repair();
            
//            Controllable 인터페이스에서 직접 받아와서 실행
            Controllable.reset();
        }
    }
}

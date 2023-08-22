package basic_0822;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Samsung");
        Mouse mouse2 = new Mouse("Samsung");
        System.out.println(mouse1.name);
        System.out.println(mouse1);
        System.out.println("mouse2 == mouse1 ? " + (mouse2 == mouse1));
        System.out.println("제조사가 같은가 ? " + mouse2.equals(mouse1));

        System.out.println("---------------------------------");

        Keyboard keyboard1 = new Keyboard("Samsung");
        Keyboard keyboard2 = new Keyboard("Samsung");
        System.out.println(keyboard1.name);
        System.out.println(keyboard1);
        System.out.println("keyboard1 == keyboard2 ? " + (keyboard1 == keyboard2));
        System.out.println("제조사가 같은가 ? " + keyboard2.equals(keyboard1));

        System.out.println("---------------------------------");

        Class c = keyboard1.getClass();
        System.out.println(c.getName());                // basic_0822.Keyboard
        System.out.println(c.getSimpleName());          // Keyboard
        System.out.println(c.getTypeName());            // basic_0822.Keyboard
        System.out.println(c.getPackage().getName());   // basic_0822
    }

}

class Mouse {
    String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " 제조사에서 생산한 마우스입니다.";
    }

    public boolean equals(Object obj) { // obj는 null 값이 넘어올 수도 있음
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this.name.equalsIgnoreCase(((Mouse) obj).name)) {
            return true;
        }
        return false;
//        if (obj instanceof Mouse mouse) {
//            if (this.name.equalsIgnoreCase(mouse.name)) {
//                return true;
//            }
//        }
//        return false;
    }

}

class Keyboard {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " 제조사에서 생산한 키보드입니다.";
    }

    public boolean equals(Keyboard keyboard) {
        if (keyboard instanceof Keyboard) {
            if (this.name.equalsIgnoreCase(keyboard.name)) {
                return true;
            }
        }
        return false;
    }
}

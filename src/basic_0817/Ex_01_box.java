package basic_0817;

public class Ex_01_box {
    String name;

    public Ex_01_box(String name) {
        this.name = name;
    }

    class ColoredBox extends Ex_01_box {

        public ColoredBox(String name) {
            super(name);
        }
    }
}

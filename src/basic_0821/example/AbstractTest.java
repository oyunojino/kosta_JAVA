package basic_0821.example;

public class AbstractTest {
    public static void main(String[] args) {
        Concerete c = new Concerete(100, 50);
        c.show();
    }
}
abstract class Abstract {
    int i;
    public Abstract(int i) {
        this.i = i;
    }
    abstract void show();
}
class Concerete extends Abstract {
    int j;
    public Concerete(int i, int j) {
        super(i);
        this.j = j;
    }
    @Override
    void show() {
        System.out.printf("i = %d, j = %d", i, j);
    }
}
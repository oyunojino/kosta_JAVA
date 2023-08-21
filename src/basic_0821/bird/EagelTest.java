package basic_0821.bird;

public class EagelTest {
    public static void main(String[] args) {
//        기명일 때,
        Eagle e = new Eagle();
        e.fly();

//        무기명일 때,
        ABird b = new ABird() {
            @Override
            void fly() {
                System.out.println("독수리가 날아간다. - 2");
            }
        };
        b.fly();
    }

    ;
}

class Eagle extends ABird {
    @Override
    void fly() {
        System.out.println("독수리가 날아간다. - 1");
    }
}

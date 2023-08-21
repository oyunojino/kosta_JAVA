package basic_0821.bird;

public class EagleTest3 {
    //    맴버 클래스
   ABird b = new ABird() {
       void fly() {
           System.out.println("독수리가 날아간다.");
       }
    };
    class Eagle extends ABird {
        void fly() {
            System.out.println("독수리가 날아간다.");
        }
    }

    Eagle eagle = new Eagle();

    //    메서드
    public static void main(String[] args) {
        EagleTest3 eagleTest3 = new EagleTest3();
        eagleTest3.b.fly();
    }
}

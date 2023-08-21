package basic_0821.example;

public class LineCompareTest {
    public static void main(String[] args) {
        Line l1 = new Line(10);
        Line l2 = new Line(20);

        int res = l1.compareTo(l2);
        System.out.println();
        if (res < 0) System.out.println(l2 + "이 더 깁니다.");
        else if (res > 0) System.out.println(l1 + " 이 더 깁니다.");
        else System.out.println("두 선의 길이가 같습니다.");
    }
}
// # 객체 비교 시 인터페이스 Comparable<T>로 비교

class Line implements Comparable<Line> {
    int length;

    public Line(int length) {
        this.length = length;
    }

//    @Override
//    public int compareTo(Object o) {
////        # 제네릭을 지정하지 않았을 때,
//        if (o instanceof Line) {
//            Line line = (Line) o;
//        }
//        return o;
//    }

    @Override
    public int compareTo(Line line) {
        return this.length - line.length;
    }

    @Override
    public String toString() {
        return "Line [" +
                "length=" + length +
                ']';
    }
}


package basic_0821.example;

public class TriangleCompareTest {
    //    삼각형의 넓이를 기준으로 크기를 비교하는 프로그램 작성하기
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 10);
        Triangle t2 = new Triangle(5, 10);

//        Line l1 = new Line(30);

        int res = t1.compareTo(t2);
//        res = t1.compareTo(l1);
        if (res > 0) {
            System.out.println(t1 + " 넓이가 큽니다.");
        } else if (res < 0) {
            System.out.println(t2 + " 넓이가 큽니다.");
        } else {
            System.out.println(t1 + "과 " + t2 + "의 넓이는 같습니다.");
        }
    }
}

class Triangle implements Comparable<Triangle> {
    int width;
    int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int findArea() {
        return width * height / 2;
    }

    //    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Triangle) {
//            Triangle triangle = (Triangle) o;
//            return (int) (this.findArea() - triangle.findArea());
//        }
//        return 0;
//    }
    @Override
    public int compareTo(Triangle triangle) {
        return this.findArea() - triangle.findArea();
    }

    @Override
    public String toString() {
        return "삼각형[" + "밑변=" + width + ", 높이=" + height + ']';
    }


}
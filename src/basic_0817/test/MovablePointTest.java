package basic_0817.test;

public class MovablePointTest {
    public static void main(String[] args) {
        Point[] points = {new Point(1, 2), new MoveablePoint(5, 6, 7, 8)};

        for (Point point : points) {
            System.out.println(point.toString());
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class MoveablePoint extends Point {
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x= " + super.getX()+
                ", y= " + super.getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
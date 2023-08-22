package basic_0822;

public class GarbageDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new Garbage(i);
            System.gc();
        }
    }
}

class Garbage {
    int no;

    public Garbage(int no) {
        this.no = no;
        System.out.println("Garbage(" + no + ")가 생성됨");
    }

//    JAVA에서는 가비지 컬랙터가 알아서 삭제하기 때문에 ver.9부터 사용 X
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage(" + no + ")가 수거됨");
    }
}
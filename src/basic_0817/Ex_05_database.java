package basic_0817;

public class Ex_05_database {

}
abstract class Database {
    double PI = 3.14;
    abstract  void use();

    abstract double getPI();
}
class Mysql extends Database {
    @Override
    void use() {
        System.out.println("Mysql을 사용합니다.");
    }

    @Override
    double getPI() {
        return 0;
    }
}
class Oracle extends Database {
    @Override
    void use() {
        System.out.println("Oracle을 사용합니다.");
    }

    @Override
    double getPI() {
        return 0;
    }
}
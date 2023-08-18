package basic_0818;

public class DatabaseTest {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        mysql.use();

        Oracle oracle = new Oracle();
        oracle.use();
    }
}

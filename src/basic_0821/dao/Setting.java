package basic_0821.dao;

public class Setting {
//    # 의존성 주입
    static DataAccessObject exchange() {
        return new MySqlDao();
    }
}

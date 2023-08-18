package basic_0818;

public interface Database {
    public void use();
}
class Mysql implements Database {
    @Override
    public void use() {
        System.out.println("Mysql");
    }
}
class Oracle implements Database {
    @Override
    public void use() {
        System.out.println("Oracle");
    }
}


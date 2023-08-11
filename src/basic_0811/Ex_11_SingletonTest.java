package basic_0811;

public class Ex_11_SingletonTest {
  public static void main(String[] args) {
    Ex_10_Singleton singleton1 = Ex_10_Singleton.getInstance();
    Ex_10_Singleton singleton2 = Ex_10_Singleton.getInstance();

    System.out.println("singleton1 = " + singleton1);
    System.out.println("singleton2 = " + singleton2);
  }
}

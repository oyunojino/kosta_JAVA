package basic_0811;

public class Ex_10_Singleton {
  private  static Ex_10_Singleton singleton = new Ex_10_Singleton();

  private Ex_10_Singleton() {

  }

  static Ex_10_Singleton getInstance() {
    return singleton;
  }
 }

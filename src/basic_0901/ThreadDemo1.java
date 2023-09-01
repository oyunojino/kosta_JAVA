package basic_0901;

public class ThreadDemo1 {
  public static void main(String[] args) {
//    MyRunable myRunable = new MyRunable();
//    myRunable.run();

    Thread thread = new Thread(new MyRunable());
//    # 멀티 x 슨차 o
//    thread.run();
//    # 멀티 o
    thread.start();


    for (int i = 0; i < 5; i++) {
      try {
        System.out.println("메인입니다!");
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}

class MyRunable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println("안녕!");
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}

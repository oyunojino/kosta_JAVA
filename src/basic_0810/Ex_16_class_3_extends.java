package basic_0810;

class Animal {
  void 숨쉰다() {
    System.out.println("숨쉰다");
  }

  void 먹는다() {
    System.out.println("먹는다");
  }

  void 움직인다() {
    System.out.println("움직인다");
  }
}

class Bird extends Animal {
  void 날다() {
    System.out.println("날다");
  }

  @Override
  void 움직인다() {
    super.움직인다();

//    System.out.println("날다");
//    System.out.println("달린다");
//    System.out.println("헤엄치다");
  }
}

class Tiger extends Animal {
  void 달리다() {
    System.out.println("달린다");
  }
}

class Fish extends Animal {
  void 헤엄치다() {
    System.out.println("헤엄치다");
  }
}

public class Ex_16_class_3_extends {
  public static void main(String[] args) {

  }
}

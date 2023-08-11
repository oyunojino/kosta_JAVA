package basic_0810;

public class Ex_17_class_4_extends_ani {
  public static void main(String[] args) {
//    상위 클래스인 object 내용 확인해보기
    Object obj = new Object();
//    obj.

    Bird bird = new Bird();
//    bird.날다();
    bird.움직인다();
    bird.숨쉰다();

    Tiger tiger = new Tiger();
//    tiger.달리다();
    tiger.움직인다();
    tiger.먹는다();

    Fish fish = new Fish();
//    fish.헤엄치다();
    fish.움직인다();
    fish.먹는다();

    Animal animal = new Animal();
    animal.움직인다();
  }
}

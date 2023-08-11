package basic_0810;

public class Ex_17_class_4_extends_ani {
  public static void main(String[] args) {
//    상위 클래스인 object 내용 확인해보기
    Object obj = new Object();
//    obj.

    Bird bird = new Bird();
    System.out.println("bird = " + bird);
//    bird.날다();
    bird.움직인다();
    bird.숨쉰다();
    bird.toString();

    Tiger tiger = new Tiger();
    System.out.println("tiger = " + tiger);
//    tiger.달리다();
    tiger.움직인다();
    tiger.먹는다();
    tiger.toString();

    Fish fish = new Fish();
    System.out.println("fish = " + fish);
//    fish.헤엄치다();
    fish.움직인다();
    fish.먹는다();
    fish.toString();

    Animal animal = new Animal();
    System.out.println("animal = " + animal);
    animal.움직인다();
  }
}

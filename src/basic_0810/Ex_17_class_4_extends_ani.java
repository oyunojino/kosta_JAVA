package basic_0810;

public class Ex_17_class_4_extends_ani {
  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.날다();
    bird.숨쉰다();

    Tiger tiger = new Tiger();
    tiger.달리다();
    tiger.먹는다();

    Animal animal = new Animal();
    animal.움직인다();
  }
}

package basic_0821.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cuckoo cuckoo = new Cuckoo();

        makeSound(dog);
        makeSound(cuckoo);
    }

    private static void makeSound(Animal animal) {
        animal.sound();
        if (animal instanceof Dog) {
//            # 기본
//            Dog dog = (Dog)animal;
//            dog.run();
//            # 축약
            ((Dog) animal).run();
        } else if (animal instanceof Cuckoo) {
            ((Cuckoo) animal).fly();
        }
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍~!");
    }

    public void run() {
        System.out.println("달린다.");
    }
}

class Cuckoo implements Animal {
    @Override
    public void sound() {
        System.out.println("뻐꾹~!");
    }

    public void fly() {
        System.out.println("날다.");
    }
}

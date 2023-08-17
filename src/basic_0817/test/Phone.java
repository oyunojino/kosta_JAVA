package basic_0817.test;

public class Phone {
    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.println(owner + "가 통화 중");
    }
}

class Telephone extends Phone {
    private String when;

    public Telephone(String owner) {
        super(owner);
    }

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void autoAnswering() {
        System.out.println(owner + "가 부재중이니 " + when + "에 전화요망");
    }
}

class Smartphone extends Telephone {
    private String game;

     public Smartphone(String owner, String game) {
        super(owner);
        this.game = game;
    }

    void playGame() {
        System.out.println(owner + "가 " + game + " 중");
    }
}

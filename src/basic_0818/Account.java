package basic_0818;

public class Account {
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1_000_000;

    private int balance;

    public Account() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balances) {
        if ((MIN_BALANCE <= balances) && (balances <= MAX_BALANCE)) {
            this.balance += balances;
        }
    }

    public void withdraw(int money) {
        if(money >= 0) {
            int remain = balance - money;
            if (remain >= MIN_BALANCE && remain <= MAX_BALANCE) {
                this.balance = remain;
            }
        }
    }

    public void deposit(int money) {
        int remain = balance + money;
        if ((MIN_BALANCE <= money) && (money <= MAX_BALANCE)) {
            this.balance = remain;
        }
    }
}

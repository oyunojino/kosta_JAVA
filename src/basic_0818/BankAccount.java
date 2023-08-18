package basic_0818;

public class BankAccount {
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1_000_000;

    private int balance;
    private String accountNo;
    private String accountOwner;

    public BankAccount() {
    }

    public BankAccount(String accountNo, String accountOwner, String balance) {

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balances) {
        if ((MIN_BALANCE <= balances) && (balances <= MAX_BALANCE)) {
            this.balance += balances;
        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
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

package Example04;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("입금 금액은 0보다 커야 합니다.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        } else if(amount > balance){
            throw new IllegalArgumentException("출금 금액이 잔액을 초과합니다.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

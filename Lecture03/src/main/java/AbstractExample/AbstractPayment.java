package AbstractExample;

public abstract class AbstractPayment {

    protected void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액은 0보다 커야 합니다.");
        }
    }

    public abstract void pay(double amount);
    public abstract void cancel(double amount);
}



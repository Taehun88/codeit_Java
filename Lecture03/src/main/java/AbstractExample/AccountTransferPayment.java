package AbstractExample;

public class AccountTransferPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("계좌이체로 " + amount + "원을 결제합니다.");
    }

    @Override
    public void cancel(double amount) {
        validatePayment(amount);
        System.out.println("계좌이체 결제를 " + amount + "원 취소합니다.");
    }
}

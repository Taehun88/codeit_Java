package Example00;

public class CryptoPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("암호화폐로 " + amount + "원을 결제합니다.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("암호화폐 결제를 " + amount + "원 취소합니다.");
    }
}

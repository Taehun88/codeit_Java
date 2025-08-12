package Example03;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("암호화폐로 " + amount + "원을 결제합니다.");
    }
}

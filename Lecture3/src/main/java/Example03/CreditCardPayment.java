package Example03;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원을 결제합니다.");
    }
}

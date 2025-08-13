package AbstractErrorExample;

public class MediumCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("중간금액(신용카드) 결제 " + amount + "원을 결제합니다.");
    }
}

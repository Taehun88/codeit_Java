package Example00;

public class Order {
    private final AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        System.out.println("주문을 처리합니다.");
        payment.pay(amount);
    }

    public void cancel(double amount) {
        System.out.println("주문을 취소합니다.");
        payment.cancel(amount);
    }
}

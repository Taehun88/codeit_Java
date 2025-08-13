package Example09;

public class PaymentMain {
    public static void main(String[] args) {
        for(PaymentMethod payment : PaymentMethod.values()){
            System.out.println(payment.getDisplayName());
        }
    }
}

package Example00;

public class PaymentProcessorTest {
    public static void main(String[] args){
        Payment[] payments = {
                new AccountTransferPayment(),
                new MobilePayment(),
                new CreditCardPayment(),
        };

        double[] amounts = {100.0, 200.0, 300.0};
        PaymentProcessor processor = new PaymentProcessor();

        for(Payment payment : payments) {
            if(payment instanceof AccountTransferPayment) {
                System.out.println("계좌이체 결제: " + amounts[0]);
                processor.pay(payment, amounts[0]);
            } else if(payment instanceof MobilePayment) {
                System.out.println("모바일 결제: " + amounts[1]);
                processor.pay(payment, amounts[1]);
            } else if(payment instanceof CreditCardPayment) {
                System.out.println("신용카드 결제: " + amounts[2]);
                processor.pay(payment, amounts[2]);
            }
        }
    }
}

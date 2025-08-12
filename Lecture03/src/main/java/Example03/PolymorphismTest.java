package Example03;

public class PolymorphismTest {
    public static void main(String[] args){
        OrderService service = new OrderService();
/*        service.processPayment(new CreditCardPayment(), 50000);
        service.processPayment(new AccountTransferPayment(), 30000);*/

        Payment[] payments = {
            new CreditCardPayment(),
            new AccountTransferPayment(),
            new CryptoPayment()
        };
        double[] amounts = {50000, 30000, 100000};
        OrderService orderService = new OrderService();
        for(Payment payment : payments){
            if(payment instanceof CreditCardPayment){
                orderService.processPayment(payment, amounts[0]);
            } else if(payment instanceof AccountTransferPayment){
                orderService.processPayment(payment, amounts[1]);
            } else if(payment instanceof CryptoPayment){
                orderService.processPayment(payment, amounts[2]);
            } else {
                System.out.println("알 수 없는 결제 방식입니다.");
            }
        }
    }
}

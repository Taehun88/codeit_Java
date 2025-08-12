package Example04;

public class PaymentServiceMain {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("Acc001");
        PaymentService paymentService = new PaymentService();

        userAccount.deposit(10000);
        System.out.println("초기 입금 금액: " + userAccount.getBalance() + "원");

        // 음수 입금 시도
        try{
            userAccount.deposit(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("입금 오류: " + e.getMessage());
        }

        // 음수 출금
        try{
            userAccount.withdraw(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("출금 오류: " + e.getMessage());
        }

        // 잔액 초과 출금
        try{
            userAccount.withdraw(20000);
        } catch (IllegalArgumentException e) {
            System.out.println("출금 오류: " + e.getMessage());
        }

        // 정상 출금
        userAccount.withdraw(10000);
        System.out.println("출금 후 잔액: " + userAccount.getBalance() + "원");

        // 결제 서비스 사용
        userAccount.deposit(30000);
        System.out.println("결제 전 잔액: " + userAccount.getBalance() + "원");

        // 금액 초과
        try {
            paymentService.processPayment(userAccount, 50000);
        } catch (IllegalArgumentException e) {
            System.out.println("결제 오류: " + e.getMessage());
        }

        // 음수 결제
        try {
            paymentService.processPayment(userAccount, -1000);
        } catch (IllegalArgumentException e) {
            System.out.println("결제 오류: " + e.getMessage());
        }

        // 음수 환불
        try {
            paymentService.processRefund(userAccount, -1000);
        } catch (IllegalArgumentException e) {
            System.out.println("환불 오류: " + e.getMessage());
        }

        // 정상 결제
        paymentService.processPayment(userAccount, 20000);

    }
}

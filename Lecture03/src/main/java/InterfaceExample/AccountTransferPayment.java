package InterfaceExample;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원을 결제합니다.");
    }
}

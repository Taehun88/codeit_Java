package Example05;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Account Transfer.");
    }
}

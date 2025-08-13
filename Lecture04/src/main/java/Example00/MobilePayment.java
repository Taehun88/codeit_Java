package Example00;

public class MobilePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Mobile Payment.");
    }
}

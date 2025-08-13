package Example06;

public class NotificationTest {
    public static void main(String[] args) {

        NotificationSender[] senders = {
            new EmailNotificationSender(),
            new SmsNotificationSender()
        };

        for (NotificationSender sender : senders) {
            NotificationService service = new NotificationService(sender);
            service.notify("Hello World!");
        }
    }
}

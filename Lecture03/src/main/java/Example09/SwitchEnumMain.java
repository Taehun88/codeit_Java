package Example09;

public class SwitchEnumMain {
    public static void main(String[] args) {
        PaymentMethod payment = PaymentMethod.CREDIT_CARD;

        switch (payment) {
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택");
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("계좌이체 결제 선택");
                break;
            case MOBILE_PAYMENT:
                System.out.println("모바일 결제 선택");
                break;
            default:
                System.out.println("알 수 없는 결제 방법");
                break;
        }
    }
}

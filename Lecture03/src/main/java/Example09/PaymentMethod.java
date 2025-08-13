package Example09;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일 결제");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return name() + "(" + description + ")";
    }
}

package EnumSwitchExample;

public class EnumSwitchTest {
    public enum OrderStatus {
        ORDERED,READY,DELEVERED
    }

    public static void printStatus(OrderStatus status) {
        switch (status) {
            case ORDERED:
                System.out.println("주문됨");
                break;
            case READY:
                System.out.println("준비완료");
                break;
            case DELEVERED:
                System.out.println("배송됨");
                break;
            default:
                System.out.println("Unknown status.");
        }
    }

    public static void main(String[] args) {
        printStatus(OrderStatus.ORDERED);
        printStatus(OrderStatus.READY);
        printStatus(OrderStatus.DELEVERED);
    }
}

package OOPLecture.Example05;

public class Utility {
    public static final double DISCOUNT_RATE;

    static {
        DISCOUNT_RATE = 0.05;
    }

    public static double applyDiscount(double price) {
        return price * (1 - DISCOUNT_RATE);
    }
}

package OOPLecture.Example05;

import static OOPLecture.Example05.Utility.applyDiscount;
public class EcommerceApp {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double finalPrice = applyDiscount(originalPrice);
        System.out.println("할인 적용된 가격: " + finalPrice);
    }
}

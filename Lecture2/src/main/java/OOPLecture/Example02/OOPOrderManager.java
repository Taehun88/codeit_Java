package OOPLecture.Example02;

class Order {
    String customer;
    String product;
    int quantity;
    int price;
    double saleRate = 0.0;

    Order(String customer, String product, int quantity, int price) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    Order(String customer, String product, int quantity, int price, double saleRate) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.saleRate = saleRate;
    }

    int getTotalPrice() {
        return quantity * price - (int)(quantity * price * saleRate);
    }

    void printOrderSummary() {
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                          customer, product, quantity, getTotalPrice());
    }
}
public class OOPOrderManager {
    public static void main(String[] args) {
        Order order = new Order("Alice", "Book", 2, 15000, 0.1);
        order.printOrderSummary();
        Order order2 = new Order("Bob", "Pen", 5, 2000);
        order2.printOrderSummary();
    }
}

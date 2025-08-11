package OOPLecture.Example03;

import java.util.ArrayList;
import java.util.List;

public class ConstructorExample {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println("Order ID: " + order1.getOrderId());
        System.out.println("order1 is paid: " + order1.isPaid());

        Order order2 = new Order("ORD001");
        System.out.println("Order ID: " + order2.getOrderId());
        System.out.println("order2 product count: " + order2.getProducts().size());

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", "Laptop", 1200.0));
        productList.add(new Product("P002", "mouse", 25.0));

        Order order3 = new Order("ORD002", productList);
        System.out.println("Order ID: " + order3.getOrderId());
        System.out.println("order3 Products: ");
        for (Product product : order3.getProducts()) {
            System.out.printf("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}

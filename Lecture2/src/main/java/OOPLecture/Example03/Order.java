package OOPLecture.Example03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    public Order(){
        this.orderId = "default";
        this.products = new ArrayList<Product>();
        this.isPaid = false;
    }

    public Order(String orderId, List<Product> products){
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    public Order(String orderId){
        this(orderId, new ArrayList<Product>());
    }

    // getter methods
    public String getOrderId() {
        return orderId;
    }
    public List<Product> getProducts() {
        return products;
    }
    public boolean isPaid() {
        return isPaid;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addProduct(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }
}

package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class ListProductToCsvExample {
    private static class Product{
        private int id;
        private String name;
        private int price;

        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("products.csv"))){
            bw.write("id,name,price");
            bw.newLine();

            List<Product> products = List.of(
                new Product(4, "Carrot", 500),
                new Product(5, "Potato", 200),
                new Product(6, "Pear", 10000)
            );

            for(Product product : products){
                bw.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                bw.newLine();
            }

            System.out.println("Product List가 CSV로 저장되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

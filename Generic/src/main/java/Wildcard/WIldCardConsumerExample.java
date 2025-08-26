package Wildcard;

import Generic.Circle;
import Generic.Rectangle;
import Generic.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WIldCardConsumerExample {
    public static void addDefaultShape(List<? super Shape> shapes){
        shapes.add(new Circle(3.0));
        shapes.add(new Rectangle(3, 4));
    }

    public static void main(String[] args) {
        List<Object> shapes = new ArrayList<>();
        addDefaultShape(shapes);

        for(Object o: shapes){
            if(o instanceof Circle){
                System.out.println("Circle Area: " + ((Circle) o).area());
            } else if(o instanceof Rectangle){
                System.out.println("Rectangle Area: " + ((Rectangle) o).area());
            }
        }
    }
}

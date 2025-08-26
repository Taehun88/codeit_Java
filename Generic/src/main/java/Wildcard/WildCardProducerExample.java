package Wildcard;

import Generic.Circle;
import Generic.Shape;

import java.util.ArrayList;
import java.util.List;

public class WildCardProducerExample {
    public static void printAllShape(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            System.out.println(shape.area());
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(2.0));
        shapes.add(new Circle(3.0));

        printAllShape(shapes);
    }
}

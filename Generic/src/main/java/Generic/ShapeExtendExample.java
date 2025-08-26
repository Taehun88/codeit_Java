package Generic;

public class ShapeExtendExample {
    public static void main(String[] args) {
        ShapeContainer<Circle> circleShapeContainer = new ShapeContainer<>();

        circleShapeContainer.addShape(new Circle(2.0));
        circleShapeContainer.addShape(new Circle(3.0));
        System.out.println("Total Area: " + circleShapeContainer.totalArea());
    }
}

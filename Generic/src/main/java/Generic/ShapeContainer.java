package Generic;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {

    private List<T> shapes = new ArrayList<>();

    public void addShape(T shape) {
        shapes.add(shape);
    }

    public double totalArea() {
        double total = 0;
        for (T shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}


import java.lang.Math;

public class Circle implements Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

}

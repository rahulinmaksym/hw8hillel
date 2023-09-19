
import java.lang.Math;

public class Square implements Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

}

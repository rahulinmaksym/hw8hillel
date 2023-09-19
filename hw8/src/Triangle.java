
public class Triangle implements Figure {

    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return (height * base)/2;
    }

}

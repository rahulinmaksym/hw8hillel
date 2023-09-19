
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(13);
        Square square = new Square(7);
        Triangle triangle = new Triangle(88, 13);
        SummaryRealization summaryRealization = new SummaryRealization();
        System.out.println(summaryRealization.sum(circle.area(), square.area(), triangle.area()));
    }

}

package homework7_2.grishel;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("This figure is RECTANGLE. Side A is: " + width + ", side B is: " + height);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Area is: " + calculateArea());
        System.out.println();
    }
}
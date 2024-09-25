package homework7_2.grishel;

public class Circle extends Figure{
    private final double radiusCircle;
    double pi = 3.14;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radiusCircle;
    }

    @Override
    public double calculateArea() {
        return pi*radiusCircle*radiusCircle;
    }

    @Override
    public void displayInfo() {
        System.out.println("This figure is CIRCLE. Radius is: " + radiusCircle);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Area is: " + calculateArea());
        System.out.println();
    }
}
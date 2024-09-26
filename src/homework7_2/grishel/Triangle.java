package homework7_2.grishel;

public class Triangle extends Figure{
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            System.out.println("This figure can't be triangle, the program is finished. Please start again");
            System.exit(0);
        }
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter;
        halfPerimeter = (sideA + sideB + sideC) / 2;

        //если равносторонний треугольник, формула https://allcalc.ru/node/780
        if (sideA == sideB && sideA == sideC) {
            return (sideA * sideA * Math.sqrt(3)) / 4;
        }

        //если равнобедренный треугольник, формула https://scalculator.ru/calc/square-triangle-isosceles/base-side/
        else if (sideA == sideB && sideA != sideC) {
            return (sideC / 4) * Math.sqrt(4 * sideA * sideA - sideC * sideC);
        } else if (sideA == sideC && sideA != sideB) {
            return (sideB / 4) * Math.sqrt(4 * sideA * sideA - sideB * sideB);
        } else if (sideB == sideC && sideB != sideA) {
            return (sideA / 4) * Math.sqrt(4 * sideB * sideB - sideA * sideA);

        //для разностороннего треугольник, формула Герона https://scalculator.ru/calc/square-triangle-versatile/3side/
        } else {
            return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("This figure is TRIANGLE. Side A is: " + sideA + ", side B is: " + sideB + ", side C is: " + sideC);
        System.out.println("Perimeter is: " + calculatePerimeter());
        System.out.println("Area is: " + calculateArea());
        if (sideA == sideB && sideA == sideC) {
            System.out.println("Triangle is equilateral (all sides are the same length)");
            System.out.println();
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Triangle is isosceles (two sides are the same length)");
            System.out.println();
        } else {
            System.out.println("Triangle is scalene (all sides are different lengths)");
            System.out.println();
        }
    }
}
package homework7_2.grishel;

import java.util.Random;

public class MainFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        double sumOfPerimeters = 0;
        double sumOfAreas = 0;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.displayInfo();
            figure.calculatePerimeter();
            figure.calculateArea();
            sumOfPerimeters = sumOfPerimeters + figure.calculatePerimeter();
            sumOfAreas = sumOfAreas + figure.calculateArea();
        }

        System.out.println("Total sum of perimeters for 5 figures is: " + sumOfPerimeters);
        System.out.println("Total sum of areas for 5 figures is: " + sumOfAreas);
    }

    public static Figure getRandomFigure() {
        Random random = new Random();
        int flag = random.nextInt(3); //флаг от 0 до 2
        if (flag == 0) {
            return new Triangle(random.nextInt(1,5), random.nextInt(1,5), random.nextInt(1,5));
        } else if (flag == 1) {
            return new Circle(random.nextInt(1,20));
        } else {
            return new Rectangle(random.nextInt(1,10), random.nextInt(1,10));
        }
    }
}
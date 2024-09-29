package homework8.task2;

import java.util.Scanner;

import static homework8.task2.BaseConverter.convert;

public class MainDegrees {
    public static void main(String[] args) {

        System.out.println("Enter the initial value of degree: ");
        Scanner scanner = new Scanner(System.in);
        double initialTemp = scanner.nextDouble();

        System.out.println("Enter the initial type of degree: C - for Celsius, K - for Kelvin, F - for Fahrenheit");
        DegreesType initialType = DegreesType.valueOf(scanner.next());

        convert(initialTemp, initialType);

        scanner.close();
    }
}

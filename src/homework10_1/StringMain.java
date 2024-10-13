package homework10_1;

import java.util.Scanner;

import static homework10_1.DocHandler.*;

public class StringMain {
    public static void main(String[] args) {
        System.out.println("Please fill the number of doc in the format: xxxx-yyy-xxxx-yyy-xyxy (x - digit, y - letter)");

        Scanner scanner = new Scanner(System.in);
        String docNumber = scanner.nextLine();

        if (docNumber.length() != 22) {
            System.out.println("The length of the document number doesn't match the format, please try again");
            System.exit(0);
        } else
            System.out.println("The length of the document number is correct, the number has been accepted for processing");

        System.out.println();
        System.out.println("RESULTS OF METHODS");

        displayTwoBlocks(docNumber);
        replaceOnAsterisk(docNumber);
        ifStartsFrom555(docNumber);
        ifEndsWith(docNumber);
        ifContainsAbc(docNumber);
        displayLettersLowerCase(docNumber);
        dislayLettersUpperCase(docNumber);

    }
}

package Homework6_Task1;

import java.util.Scanner;

public class Homework6_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, you have 3 credit card, please enter the initial amounts for all cards");

        System.out.println("Enter initial amount for card 1, amount should be more 0: ");
        double initialAmountCard1 = scanner.nextDouble();
        if (initialAmountCard1 < 0) {
            System.out.println("You entered amount < 0 for card 1, the program is finished");
            System.exit(0);
        }

        System.out.println("Enter initial amount for card 2, amount should be more 0: ");
        double initialAmountCard2 = scanner.nextDouble();
        if (initialAmountCard2 < 0) {
            System.out.println("You entered amount < 0 for card 2, the program is finished");
            System.exit(0);
        }

        System.out.println("Enter initial amount for card 3, amount should be more 0: ");
        double initialAmountCard3 = scanner.nextDouble();
        if (initialAmountCard3 < 0) {
            System.out.println("You entered amount < 0 for card 3, the program is finished");
            System.exit(0);
        }

        CreditCard creditCard1 = new CreditCard(1, "№52667623682837", initialAmountCard1);
        CreditCard creditCard2 = new CreditCard(2, "№49999623682992", initialAmountCard2);
        CreditCard creditCard3 = new CreditCard(3, "№33899623682323", initialAmountCard3);

        //test case
        creditCard1.addSum(100);
        creditCard2.addSum(1000);
        creditCard3.withdrawSum(100);

        creditCard1.showCardInfo();
        creditCard2.showCardInfo();
        creditCard3.showCardInfo();
    }
}
package Homework6_Task1;

public class CreditCard {
    private final long id;
    private final String accountNumber;
    private double currentSum;

    public CreditCard(long id, String accountNumber, double currentSum) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public void addSum(double sumForAdding) {
        currentSum = currentSum + sumForAdding;
    }

    public void withdrawSum(double sumForWithdraw) {
        currentSum = currentSum - sumForWithdraw;
    }

    public void showCardInfo() {
        System.out.println("Account number for " + id + " card is: " + accountNumber);
        System.out.println("Current sum on the account for " + id + " card is: " + currentSum);
        if (currentSum < 0) {
            System.out.println("Please pay attention that the current sum for card " + id + " is < 0, please pay off the debt for card !");
        }
        System.out.println();
    }
}
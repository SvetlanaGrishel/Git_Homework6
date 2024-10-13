package homework9_2;

import java.util.Scanner;
import static homework9_2.fields.checkFields;

public class MainLogin {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        String login, password, confirmPassword;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the login (should contain less than 20 characters and shouldn't contain spaces):");
        login = scanner.nextLine();
        System.out.println("Please enter the password (should contain less than 20 characters, shouldn't contain spaces and should contain at least one '1':");
        password = scanner.nextLine();
        System.out.println("Please enter the confirmation password (should be the same as password):");
        confirmPassword = scanner.nextLine();

        if (login.equals("") || password.equals("") || confirmPassword.equals("")) {
            System.out.println("You haven't entered all the data. Try again");
            System.exit(0);
        }

        if (checkFields(login, password, confirmPassword) == true) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Login failed, try again");
        }

        scanner.close();
    }
}

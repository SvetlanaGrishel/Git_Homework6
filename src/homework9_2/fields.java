package homework9_2;

public class fields {

    public static boolean checkFields(String login, String password, String confirmPassword)
        throws WrongLoginException,
               WrongPasswordException {

        try {
            if (login.length() >= 20 && login.contains(" ")) {
                throw new WrongLoginException("Login should contain less than 20 characters and shouldn't contain spaces");
            } else if (login.contains(" ")) {
                throw new WrongLoginException("Login shouldn't contain spaces");
            } else if (login.length() >= 20) {
                throw new WrongLoginException("Login should contain less than 20 characters");
            }

            if (password.length() >= 20 && password.contains(" ") && password.contains("1")){
                throw new WrongPasswordException("Password should contain less than 20 characters, shouldn't contain spaces and should contain at least one '1'");
            } else if (password.length() >= 20 && password.contains(" ")) {
                throw new WrongPasswordException("Password should contain less than 20 characters and shouldn't contain spaces");
            } else if (password.length() >= 20 && !password.contains("1")) {
                throw new WrongPasswordException("Password should contain less than 20 characters and should contain at least one '1'");
            } else if (password.contains(" ") && !password.contains("1")) {
                throw new WrongPasswordException("Password shouldn't contain spaces and should contain at least one '1'");
            } else if (password.length() >= 20) {
                throw new WrongLoginException("Password should contain less than 20 characters");
            } else if (password.contains(" ")) {
                throw new WrongPasswordException("Password shouldn't contain spaces");
            } else if (!password.contains("1")) {
                throw new WrongPasswordException("Password should contain at least one '1'");
            }

            if (password.equals(confirmPassword) == false) {
                throw new WrongPasswordException("Confirmation password doesn't match the password");
            }

            return true;
        }

        catch (WrongPasswordException | WrongLoginException e ) {
            System.out.println("Following error was found: " + e.getMessage());
            return false;
        }
    }
}
public class Validator {
    public static void checkPassword(String pwd) {
        try {
            if (pwd.length() < 8) {
                throw new InvalidPasswordException("The given password is too short!");
            }
        } catch (InvalidPasswordException e) {
            System.err.println(e.getMessage());
        }
    }
}

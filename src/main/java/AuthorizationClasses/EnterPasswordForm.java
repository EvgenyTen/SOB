package AuthorizationClasses;

public class EnterPasswordForm {
    public static String validPassword(String password) {
        int length = password.length();
        if (length > 3 && length < 9) return password;
        else {
            System.out.println("Invalid password.Must be more then 3 and less then 9 letters without spaces");
            return null;
        }
    }
}

package AuthorizationClasses;

public class EnterLoginForm {
    public static String validLogin(String login) {
        int length = login.length();
        if (length > 3 && length < 9) return login;
        else {
            System.out.println("Invalid login.Must be more then 3 and less then 9 letters without spaces");
            return null;
        }
    }
}
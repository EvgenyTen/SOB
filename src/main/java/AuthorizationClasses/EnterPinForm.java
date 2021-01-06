package AuthorizationClasses;

public class EnterPinForm {
    public static Integer validPin(int pin) {
        int validPin = pin;
        int integerAmount = 1;
        while ((pin /= 10) > 0) integerAmount++;
        if (integerAmount == 4) {
            return validPin;
        } else {
            System.out.println("Invalid PIN.Must be 4 digits without spaces");
            return null;
        }
    }
}
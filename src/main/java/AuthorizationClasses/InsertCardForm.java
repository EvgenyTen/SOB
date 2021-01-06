package AuthorizationClasses;

public class InsertCardForm {

    public static Long validCard(long cardNumber) {
        long validCard = cardNumber;
        int integerAmount = 1;
        while ((cardNumber /= 10) > 0) integerAmount++;
        if (integerAmount == 16) {
            return validCard;
        } else {
            System.out.println("Invalid card number.Must be 16 digits without spaces");
            return null;
        }
    }
}
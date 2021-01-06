package AuthorizationClasses;

public class InsertCardForm {

    public static long validCard(long cardNumber){
        int integerAmount=1;
        while((cardNumber/=10)>0) integerAmount++;
        System.out.println( integerAmount);
        //return cardNumber;
        return cardNumber;
    }
}

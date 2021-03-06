package AuthorizationClasses;
import model.ReadObjects;
import model.Worker;
import java.util.List;
import java.util.Scanner;

public class AuthorizationClass {

    public static void entrance() {
        Scanner scanner = new Scanner(System.in);
        int choise, pin, validPin;
        long cardNumber, validCardNumber;
        String login, validLogin, password, validPassword;
        while (true) {
            System.out.println("For Client enter emulation ,Please Enter -1");
            System.out.println("For Worker enter emulation ,Please Enter -2");
            System.out.println("For Quit ,Please Enter -3");
            System.out.println("Enter your Choise:   ");
            choise = scanner.nextInt();
            switch (choise) {
                case 1 -> {
                    System.out.println("Please enter valid card number :");
                    cardNumber = scanner.nextLong();
                    validCardNumber = AuthorizationClasses.InsertCardForm.validCard(cardNumber);
                    System.out.println("Please enter valid PIN number :");
                    pin = scanner.nextInt();
                    validPin = AuthorizationClasses.EnterPinForm.validPin(pin);


                }
                case 2 -> {
                    System.out.println("Please enter valid worker login :");
                    Scanner loginObj = new Scanner(System.in);
                    login = loginObj.nextLine();
                    validLogin = AuthorizationClasses.EnterLoginForm.validLogin(login);
                    System.out.println("Please enter valid password :");
                    Scanner passwordObj = new Scanner(System.in);
                    password = loginObj.nextLine();
                    validPassword = AuthorizationClasses.EnterPasswordForm.validPassword(password);
                    List<Worker> workers= ReadObjects.readTestWorkers();
                    System.out.println(workers);
                    for(int i=0;i<workers.size();i++){
                    String dataCheck=validLogin+" "+validPassword;
                    if(dataCheck.equals(workers.get(i))){
                    System.out.println("Checked");
                    boolean alarmstartus=AuthorizationClasses.AlarmOnOff.off(true);
                    }
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Wrong entry !!!");
            }
        }
    }

}
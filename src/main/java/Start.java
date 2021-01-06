import java.util.Scanner;

public class Start {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int choise;
        while(true){
            System.out.println("For Client enter emulation ,Please Enter -1");
            System.out.println("For Worker enter emulation ,Please Enter -2");
            System.out.println("For Quit ,Please Enter -3");
            System.out.println("Enter your Choise:   ");
            choise=scanner.nextInt();
            switch(choise){
                case 1:
                    System.out.println("Please enter valid card number :");
                case 2:
                    System.out.println("Please enter valid worker login :");
                case 3:System.exit(0);
                default:System.out.println("Wrong entry !!!");

            }

        }
    }
}

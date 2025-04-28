package Task_3;

import java.util.Scanner;

public class ATMview {
    UXhelper ux = new UXhelper();

    private final Scanner sc = new Scanner(System.in);
    private final ATMService  atmService;

    public ATMview(ATMService atmService) {
        this.atmService = atmService;
    }

    public void start(){
        int option;
        System.out.println(ux.welcome);
        System.out.println(ux.provideUserDetails);
        atmService.showAccountDetails();

        do{
            displayMenu();
            option = sc.nextInt();
            userChoice(option);
        }while (option != 4);
    }

    private void userChoice(int option) {
        switch(option){
            case 1:
                atmService.checkBalance();
                break;

                case 2:
                    System.out.println(ux.case1);
                    atmService.performDeposit(sc.nextDouble());
                    break;

                    case 3:
                        System.out.println(ux.case2);
                        atmService.performWithdraw(sc.nextDouble());
                        break;

                        case 4:
                            System.out.println(ux.case3);
                            break;

                            default:
                                System.out.println(ux.defaultCase);


        }
    }

    private void displayMenu(){
        System.out.println(ux.mENU);
        System.out.println(ux.checkBlnce);
        System.out.println(ux.deposit);
        System.out.println(ux.withdraw);
        System.out.println(ux.exit);
        System.out.print(ux.choice);

    }
}

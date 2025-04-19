package Task_1;

import java.util.Scanner;

public class Task_1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        HelperUX ux = new HelperUX();
        System.out.println(" "+ ux.greetings());
       String playerName = "";
       //Check player name is empty or not
       do{
           System.out.println(" "+ ux.askingForname());
           playerName = sc.nextLine();
           if(playerName.equals("")){
               System.out.println(" "+ ux.PlayerNameEmpty);
           }
       }while (playerName.trim().isEmpty());

       Player player =  new Player(playerName);

       //Assigning numbers
        int min=1;
        int max = 100;
        int maxAttemps = 5;

        Game game = new Game(player,min,max,maxAttemps);
        int round =1;

        String playAgain;

        do{
            game.setRound(round ++);
            System.out.println(ux.playerStatues());
            playAgain = sc.nextLine();

        }while(playAgain.equalsIgnoreCase("Yes"));
        System.out.println(ux.thanking+ player.getName() + "Your final Score is "+ player.getScore());
        sc.close();


    }
}

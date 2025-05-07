package Task_1;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final NumberGenerator numberGenerator;
    private final int maxAttempts;
    private final Scanner sc;
    private final HelperUX ux;
    private boolean help;
    private int targetNumber;


    public Game(Player player, int min, int max, int maxAttempts) {
        this.player = player;
        this.numberGenerator = new NumberGenerator(min, max);
        this.maxAttempts = maxAttempts;
        this.sc = new Scanner(System.in);
        this.ux = new HelperUX();
        this.help = false;
        this.targetNumber = 0;

    }
    // For give hint to user it reduces 10 from target value and also add 10 to it
    private int[] helperFunction(){
        if (help){
             int predict1 =  targetNumber- 10;
            int predict2 = targetNumber + 10;
            if(predict1 <10){
                predict1 = 0;
            }
             return new int []{predict1,predict2};
        }
        return null;

    }
    public void setRound(int roundNumber){
        targetNumber = numberGenerator.generate();
        int attempt = 0;
        boolean gessedCorrectly = false;
        String helpHolder;

        System.out.println(ux.round+ roundNumber + ux.askToGess);
        System.out.println(ux.line);
        System.out.println(ux.asktoGessNum);

        while(attempt < maxAttempts) {
            if(attempt > 3){
                System.out.println(ux.provideHint);
                helpHolder = sc.nextLine();
                if(helpHolder.equalsIgnoreCase("Yes")){
                    help = true;
                    int helpnumber[] = helperFunction();
                    System.out.println(ux.helpinggreet+ helpnumber[0]+ ", and  "+helpnumber[1]);
                }
                else if(helpHolder.equalsIgnoreCase("No")){
                    continue;
                }
            }

            int guess;

            try{
                guess = Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println(ux.onlyNumaric);
                continue;
            }
            attempt++;

            if(guess < targetNumber){
                System.out.println(ux.toolowPredict);
                //System.out.println(targetNumber);
            }else if(guess > targetNumber){
                System.out.println(ux.tooHightPredict);
            }else {
                System.out.println(ux.cong+ player.getName() +  ux.win + guess + " \uD83E\uDD73");
                int point = 10 - attempt +1;
                player.addScore(point);
                System.out.println(ux.pointValue+point);
                gessedCorrectly = true;
                break;
            }
        }
        if(!gessedCorrectly){
            System.out.println(ux.outofAttempt + targetNumber + " !");
        }
        System.out.println(ux.cScore+ player.getScore());
    }

}

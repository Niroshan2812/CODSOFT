package Task_1;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final NumberGenerator numberGenerator;
    private final int maxAttempts;
    private final Scanner scanner;

    public Game(Player player, int min, int max, int maxAttempts) {
        this.player = player;
        this.numberGenerator = new NumberGenerator(min, max);
        this.maxAttempts = maxAttempts;
        this.scanner = new Scanner(System.in);

    }
    public void setRound(int roundNumber){
        int targetNumber = numberGenerator.generate();
        int attempt = 0;
        boolean gessedCorrectly = false;

        System.out.println("\n Round "+ roundNumber + " Gess the number! ");

        while(attempt < maxAttempts) {
            System.out.println("Include gessed number");
            int guess;

            try{
                guess = Integer.parseInt(scanner.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Enter valid numaric value");
                continue;
            }
            attempt++;

            if(guess < targetNumber){
                System.out.println("Too low !");
            }else if(guess > targetNumber){
                System.out.println("Too high !");
            }else {
                System.out.println("Congratulations! You guessed the number " + guess + " !");
                int point = 10 - attempt +1;
                player.addScore(point);
                System.out.println("Your point is "+point);
                gessedCorrectly = true;
                break;
            }
        }
        if(!gessedCorrectly){
            System.out.println("Out of attemps correct number is " + targetNumber + " !");
        }
        System.out.println("\n Corrent Score is "+ player.getScore());
    }

}

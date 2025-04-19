package Task_1;

public class HelperUX {
    //Worning variables
    public final String PlayerNameEmpty = " \uD83D\uDE44 Oops! Player name can't be empty";
    public final String onlyNumaric = " \uD83D\uDE44 Oops! We only accept numbers";

    // questioning
    public final String asktoGessNum = " \uD83D\uDE01 What is your guess?";

    //Greetings
    public final String thanking = "\n \uD83E\uDD70 Thanks for playing !!! ";
    public final String cong = "   \uD83C\uDF89 \uD83C\uDF89 Congratulations! ";
    public final String win = "\uD83D\uDCA1 You guessed right the number it is: ";


    //hlp
    public final String round = "\n    \uD83D\uDC49 Round Number: ";
    public final String askToGess = " ---- Can you Guess the number! \uD83D\uDE0F";
    public final String provideHint = " \uD83D\uDE44 Did you need any hint (Yes/No)";
    public final String helpinggreet = " \uD83E\uDD2B The number you looking around :";
    public final String toolowPredict = " \uD83E\uDD16 Nope... it's Too low !";
    public final String tooHightPredict  = " \uD83E\uDD16 Nope... it's Too high !";
    public final String pointValue = " \uD83D\uDC49 your point value is: ";
    public final String outofAttempt = " \uD83D\uDE15 Out of attempts!!  correct number is: ";
    public final String cScore = " \n \uD83D\uDC49 Current Score is: ";
    public final String line = "---------------------------------------------------------------------------------------------------------------------\n";

    public final String greetings (){

        return "********************************************************************************************************************************\n" +
                "--------------------------------- Hello! \uD83D\uDE01 Welcome to Number Guessing Game !! ---------------------------------------------------\n" +
                "*******************************************************************************************************************************" +
                "\n";
    }
    public final String askingForname(){
        return "    \uD83D\uDC49 Can I know your Name  \uD83E\uDD14 ?";
    }

    public final String playerStatues(){
        return "\n" +
                "--------------------------------- \uD83D\uDC49 Do you want to play again? (Yes/No) ---------------------------------------------------\n" +
                "*******************************************************************************************************************************" +
                "\n";



    }
}

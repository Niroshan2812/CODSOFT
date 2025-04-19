package Task_1;

public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    //Add score to existing score
   public void addScore(int points){
        this.score += points;
   }
   public void resetScore(){
        this.score = 0;
   }

}

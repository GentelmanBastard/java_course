import org.jetbrains.annotations.Contract;

public class methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println("Your final score was " + highScore);
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Dave", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mark", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Debbie", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Matt", position);

    }

    @Contract(pure = true)
    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
    private static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }
    private static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }
        return 4;
    }

}

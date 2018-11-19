public class overload {
    public static void main(String[] args) {
        int newScore = calculateScore("Matt", 500);
        System.out.println("New score is: " + newScore);
        newScore = calculateScore("Patt", 504);
        System.out.println("New score is: " + newScore);
        System.out.println(calculateScore(600));
        System.out.println(calculateScore(800));
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The final score is " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The final score is " + highScore);


        int Position = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1", Position);

        Position = calculateHighScorePosition(1000);
        displayHighScorePosition("Player2", Position);

        Position = calculateHighScorePosition(500);
        displayHighScorePosition("Player3", Position);

        Position = calculateHighScorePosition(100);
        displayHighScorePosition("Player4", Position);

        Position = calculateHighScorePosition(25);
        displayHighScorePosition("Player4", Position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " secured position " + playerPosition + " in the game.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
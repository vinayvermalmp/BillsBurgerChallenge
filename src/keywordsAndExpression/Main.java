// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package keywordsAndExpression;
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted*bonus);
            System.out.println("Final score "+ finalScore);
        }


         gameOver = true;
         score = 10000;
         levelCompleted = 8;
         bonus = 200;
         finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted*bonus);
            System.out.println("Final score "+ finalScore);
        }

    }
}
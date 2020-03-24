package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final Score = " + highScore);

        int highScore2 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final Score = " + highScore2);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sachin", highScorePosition);


        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Peter", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jowin", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jithin", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table ");
    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;//assuming initial position is 4
        if (score >= 1000) {
            position =1;
        } else if (score >= 500) {
            position =2;
        } else if (score >= 100) {
           position = 3;
        }
        return position;

    }


}

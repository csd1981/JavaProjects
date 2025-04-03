package com.craigdavies.wordgame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] easyWords = {"java", "programming", "class", "computer", "method"};
        WordGuessingGame game = new WordGuessingGame(easyWords, 10);

        Scanner scan = new Scanner(System.in);
        boolean shouldPlayAgain = false;

        int wins = 0;
        int losses = 0;

        do {

            String result = game.play();

            if (result.equals("Win")) {
                wins += 1;
            } else {
                losses += 1;
            }

            System.out.println("Wins: " + wins + ", Losses: " + losses);


            System.out.print("Would you like to play again?");
            char playAgain = scan.nextLine().toLowerCase().charAt(0);
            shouldPlayAgain = playAgain =='y';
        } while (shouldPlayAgain);

        game.play();
    }
}

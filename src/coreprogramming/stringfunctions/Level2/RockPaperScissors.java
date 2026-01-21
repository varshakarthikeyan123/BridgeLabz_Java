/*
 This program implements a Rock–Paper–Scissors game
 between a user and the computer.
 The user plays multiple rounds, and the computer
 randomly generates its choice for each round.
 The program determines the winner of each game,
 stores game results, calculates win statistics,
 and displays a summary at the end.
 It demonstrates random number generation,
 string comparison, arrays, methods,
 and basic game logic in Java.
*/

package coreprogramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class for user input

public class RockPaperScissors {

    public static String getComputerChoice() {

        int choice = (int) (Math.random() * 3); // generates random number: 0, 1, or 2

        if (choice == 0)
            return "Rock"; // computer chooses Rock
        else if (choice == 1)
            return "Paper"; // computer chooses Paper
        else
            return "Scissors"; // computer chooses Scissors
    }

    public static String findWinner(String user, String computer) {

        // checks for draw condition
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        // checks all winning conditions for the user
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer"; // computer wins in remaining cases
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3]; // stores stats for user and computer

        double userPercent = (userWins * 100.0) / totalGames; // calculates user win percentage
        double computerPercent = (computerWins * 100.0) / totalGames; // calculates computer win percentage

        stats[0][0] = "User"; // label for user
        stats[0][1] = String.valueOf(userWins); // number of user wins
        stats[0][2] = String.format("%.2f", userPercent) + "%"; // formatted user win percentage

        stats[1][0] = "Computer"; // label for computer
        stats[1][1] = String.valueOf(computerWins); // number of computer wins
        stats[1][2] = String.format("%.2f", computerPercent) + "%"; // formatted computer win percentage

        return stats; // returns statistics array
    }

    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        // displays result of each game
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\tWins\tWin Percentage");

        // displays final statistics
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter number of games: "); // asks user for number of rounds
        int n = sc.nextInt(); // reads number of games
        sc.nextLine(); // clears newline from input buffer

        String[][] gameResults = new String[n][3]; // stores user choice, computer choice, and winner

        int userWins = 0; // counts user wins
        int computerWins = 0; // counts computer wins

        // loop runs for each game
        for (int i = 0; i < n; i++) {

            System.out.print("Enter your choice (Rock/Paper/Scissors): "); // prompts user choice
            String userChoice = sc.nextLine(); // reads user choice

            String computerChoice = getComputerChoice(); // gets computer's random choice
            String winner = findWinner(userChoice, computerChoice); // determines winner

            if (winner.equals("User"))
                userWins++; // increments user win count
            else if (winner.equals("Computer"))
                computerWins++; // increments computer win count

            gameResults[i][0] = userChoice; // stores user choice
            gameResults[i][1] = computerChoice; // stores computer choice
            gameResults[i][2] = winner; // stores winner
        }

        String[][] stats = calculateStats(userWins, computerWins, n); // calculates statistics
        displayResults(gameResults, stats); // displays all results and statistics
    }
}

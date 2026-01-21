/*
 This program simulates a deck of playing cards.
 It performs the following operations:
 1) Initializes a standard deck of 52 cards using suits and ranks.
 2) Shuffles the deck randomly.
 3) Distributes a given number of cards equally among players.
 4) Displays the cards received by each player.
 The program demonstrates array handling, nested loops,
 randomization, method decomposition, and formatted output in Java.
*/

package CoreProgramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class DeckOfCards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length; // total number of cards
        String[] deck = new String[numOfCards]; // array to store deck
        int index = 0; // index to track position in deck

        // creates deck by combining each suit with each rank
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit; // adds card to deck
            }
        }
        return deck; // returns initialized deck
    }

    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length; // total cards in deck

        // shuffles deck using Fisher–Yates algorithm
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // random index
            String temp = deck[i]; // temporary storage
            deck[i] = deck[randomCardNumber]; // swaps cards
            deck[randomCardNumber] = temp;
        }
        return deck; // returns shuffled deck
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {

        // checks if cards can be equally distributed
        if (n % players != 0) {
            System.out.println("Cards cannot be distributed equally among players.");
            return null;
        }

        int cardsPerPlayer = n / players; // number of cards per player
        String[][] playerCards = new String[players][cardsPerPlayer]; // stores player cards

        int cardIndex = 0; // tracks current card index in deck

        // distributes cards to each player
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++]; // assigns card to player
            }
        }
        return playerCards; // returns distributed cards
    }

    public static void printPlayers(String[][] players) {

        if (players == null)
            return; // exits if distribution failed

        // prints cards of each player
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]); // displays each card
            }
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // card suits
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        }; // card ranks

        String[] deck = initializeDeck(suits, ranks); // initializes deck
        deck = shuffleDeck(deck); // shuffles deck

        System.out.print("Enter number of cards to distribute: "); // prompts user
        int n = sc.nextInt(); // reads number of cards

        System.out.print("Enter number of players: "); // prompts user
        int players = sc.nextInt(); // reads number of players

        // checks if requested cards exceed deck size
        if (n > deck.length) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        String[][] playerCards = distributeCards(deck, n, players); // distributes cards
        printPlayers(playerCards); // displays player cards
    }
}

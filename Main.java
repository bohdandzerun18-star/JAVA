import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int rock;
        int paper;
        int scissors;
        Random rand = new Random();
        rock = rand.nextInt(100);
        paper = rand.nextInt(100);
        scissors = rand.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Choose your weapon: (1) Rock, (2) Paper, (3) Scissors");
        int userChoice = scanner.nextInt();
        int computerChoice = 0;
        if (rock > paper && rock > scissors) {
            computerChoice = 1; // Rock
        } else if (paper > rock && paper > scissors) {
            computerChoice = 2; // Paper
        } else {
            computerChoice = 3; // Scissors
        }
        System.out.println("Computer chose: " + (computerChoice == 1 ? "Rock" : computerChoice == 2 ? "Paper" : "Scissors"));
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
